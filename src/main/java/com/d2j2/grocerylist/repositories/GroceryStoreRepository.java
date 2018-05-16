package com.d2j2.grocerylist.repositories;

import com.d2j2.grocerylist.entities.GroceryStore;
import org.springframework.data.repository.CrudRepository;

public interface GroceryStoreRepository extends CrudRepository<GroceryStore, Long> {

    Iterable<GroceryStore> findAllByChain_Id(long id);
}
