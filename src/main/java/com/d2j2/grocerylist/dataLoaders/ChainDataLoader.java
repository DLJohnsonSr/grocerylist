package com.d2j2.grocerylist.dataLoaders;

import com.d2j2.grocerylist.entities.Chain;
import com.d2j2.grocerylist.entities.GroceryStore;
import com.d2j2.grocerylist.repositories.ChainRepository;
import com.d2j2.grocerylist.repositories.GroceryStoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ChainDataLoader implements CommandLineRunner {

    @Autowired
    ChainRepository chainRepo;
    @Autowired
    GroceryStoreRepository storeRepo;
    @Override
    public void run(String... args) throws Exception {

//        ADD Safewat Chain and 3 stores
        Chain aChain = new Chain("Safeway");
        chainRepo.save(aChain);

        GroceryStore aStore = new GroceryStore("Safeway #312","2311 Rockville Pike","Rockville","MD","20850", aChain);
        storeRepo.save(aStore);

        aStore = new GroceryStore("Safeway #1052","12890 Shady Grove Road","Gaithersburg","MD","20853", aChain);
        storeRepo.save(aStore);


        aStore = new GroceryStore("Safeway #689","3542 Quincy Orchard Blvd","Germantown","MD","20857", aChain);
        storeRepo.save(aStore);


    }
}
