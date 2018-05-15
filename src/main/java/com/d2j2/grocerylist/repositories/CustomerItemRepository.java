package com.d2j2.grocerylist.repositories;

import com.d2j2.grocerylist.entities.CustomerListItem;
import org.springframework.data.repository.CrudRepository;

public interface CustomerItemRepository extends CrudRepository<CustomerListItem, Long> {
}
