package com.d2j2.grocerylist.controllers;

import com.d2j2.grocerylist.repositories.ChainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @Autowired
    ChainRepository chainRepository;

    @GetMapping("/login")
    public String loginUser(){
        return "login";
    }
    @GetMapping("/")
    public String showHomePage(Model model){
        return "index";
    }
}
