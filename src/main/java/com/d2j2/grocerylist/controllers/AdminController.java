package com.d2j2.grocerylist.controllers;

import com.d2j2.grocerylist.entities.Chain;
import com.d2j2.grocerylist.entities.GroceryStore;
import com.d2j2.grocerylist.repositories.ChainRepository;
import com.d2j2.grocerylist.repositories.GroceryStoreRepository;
import com.d2j2.grocerylist.repositories.MasterListItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class AdminController {

    @Autowired
    ChainRepository chainRepository;
    @Autowired
    GroceryStoreRepository groceryStoreRepository;
    @Autowired
    MasterListItemRepository masterListItemRepository;

    @GetMapping("/admin/admindash")
    public String viewDashboard(Model model){
        model.addAttribute("chains", chainRepository.findAll());
        model.addAttribute("newChain", new Chain());
        return "admin/admindash";
    }
    @PostMapping("/admin/savechain")
    public String saveChain(@Valid @ModelAttribute("chain") Chain chain, BindingResult result){
        if(result.hasErrors()){
            return "admin/admindash";
        }
        chainRepository.save(chain);
        return "redirect:/admin/admindash";
    }
    @GetMapping("admin/viewchain{id}")
    public String viewChain(@PathVariable("id") long id, Model model){
        model.addAttribute("chain", chainRepository.findById(id));
        model.addAttribute("stores", groceryStoreRepository.findAll());
        model.addAttribute("newStore", new GroceryStore());
        return "viewchain";
    }
    @GetMapping("admin/masterlist{id}")
    public String viewMasterlist(Model model){
        return "masterlist";
    }


}
