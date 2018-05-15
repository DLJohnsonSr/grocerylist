package com.d2j2.grocerylist.repositories;

import com.d2j2.grocerylist.entities.Item;
import org.springframework.data.repository.CrudRepository;

public interface ItemRepository extends CrudRepository<Item, Long> {
}
