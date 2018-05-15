package com.d2j2.grocerylist.repositories;


import com.d2j2.grocerylist.entities.AppUser;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<AppUser, Long> {
    AppUser findByUsername(String username);
}
