package com.d2j2.grocerylist.security;

import com.d2j2.grocerylist.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    UserRepository userRepository;

    @Bean
    PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Override
    public UserDetailsService userDetailsServiceBean() throws Exception {
        return new SSUSD(userRepository);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        String[] everyone = {"/", "/css/**","/img/**","/vendor/**","/signup","/saveuser","/login"};
        String[] user = {everyone.toString()};
        String[] sM = {user.toString(),"/admin/**"};
        String[] dM = {sM.toString()};
        String[] boss = {dM.toString()};

        http.authorizeRequests()
                .antMatchers(everyone).permitAll()
                .antMatchers(user).access("hasAuthority('USER')")
                .antMatchers(sM).access("hasAuthority('SM')")
                .antMatchers(dM).access("hasAuthority('DM')")
                .antMatchers(boss).access("hasAuthority('BOSS')")
                .anyRequest().authenticated()
                .and()
//                .formLogin().permitAll()
                .formLogin().loginPage("/login").defaultSuccessUrl("/").permitAll()
                .and()
                .logout().logoutRequestMatcher(new AntPathRequestMatcher("/logout"));

        http.csrf().disable();

        http.headers().frameOptions().disable();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {

        auth.inMemoryAuthentication().withUser("Dom")
                .password(passwordEncoder().encode("password")).authorities("USER","SM","DM","BOSS")
                .and()
                .passwordEncoder(passwordEncoder());

        auth.userDetailsService(userDetailsServiceBean()).passwordEncoder(passwordEncoder());
    }
}
