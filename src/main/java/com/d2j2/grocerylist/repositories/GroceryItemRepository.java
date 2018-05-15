package com.d2j2.grocerylist.repositories;

import com.d2j2.grocerylist.entities.GroceryStoreItem;
import org.springframework.data.repository.CrudRepository;

public interface GroceryItemRepository extends CrudRepository<GroceryStoreItem, Long> {
}
