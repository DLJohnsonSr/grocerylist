package com.d2j2.grocerylist.controllers;

import com.d2j2.grocerylist.entities.AppUser;
import com.d2j2.grocerylist.repositories.RoleRepository;
import com.d2j2.grocerylist.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class CustomerController {

    @Autowired
    RoleRepository roleRepository;
    @Autowired
    UserRepository userRepository;

    @GetMapping("/signup")
    public String signUpNewUsers(Model model){
        model.addAttribute("newUser", new AppUser());
        return "signup";
    }
    @PostMapping("/saveuser")
    public String saveNewUsers(@Valid @ModelAttribute("newUser") AppUser appUser, BindingResult result){
        if(result.hasErrors()){
            return "signup";
        }
        appUser.addRoles(roleRepository.findByRoleName("USER"));
        userRepository.save(appUser);
        return "redirect:login";
    }
}
