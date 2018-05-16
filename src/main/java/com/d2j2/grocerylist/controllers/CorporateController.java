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
public class CorporateController {

    @Autowired
    ChainRepository chainRepository;
    @Autowired
    GroceryStoreRepository groceryStoreRepository;
    @Autowired
    MasterListItemRepository masterListItemRepository;

    @GetMapping("/admin/viewchains")
    public String viewDashboard(Model model){
        model.addAttribute("chains", chainRepository.findAll());
        model.addAttribute("newChain", new Chain());
        return "/admin/viewchains";
    }
    @PostMapping("/admin/savechain")
    public String saveChain(@Valid @ModelAttribute("chain") Chain chain, BindingResult result){
        if(result.hasErrors()){
            return "/admin/viewchains";
        }
        chainRepository.save(chain);
        return "redirect:/admin/viewchains";
    }
    @GetMapping("/admin/masterlist/{id}")
    public String viewMasterlist(@PathVariable("id") long id, Model model){
        return "masterlist";
    }
    @GetMapping("/admin/viewstores/{id}")
    public String viewChain(@PathVariable("id") long id, Model model){
        model.addAttribute("stores", groceryStoreRepository.findAllByChain_Id(id));
        model.addAttribute("newStore", new GroceryStore());
        model.addAttribute("thisChain", chainRepository.findById(id));
        return "/admin/viewstores";
    }

    @PostMapping("/admin/savestore")
    public String saveStore(@Valid @ModelAttribute("store") GroceryStore store, BindingResult result){
        if(result.hasErrors()){
            return "/admin/viewstores/{id}";
        }
        groceryStoreRepository.save(store);
        return "/admin/viewstores/{id}";
    }



}
