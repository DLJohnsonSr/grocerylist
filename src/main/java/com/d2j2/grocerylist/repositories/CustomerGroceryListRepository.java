package com.d2j2.grocerylist.repositories;

import com.d2j2.grocerylist.entities.CustomerGroceryList;
import org.springframework.data.repository.CrudRepository;

public interface CustomerGroceryListRepository extends CrudRepository<CustomerGroceryList, Long> {
}
