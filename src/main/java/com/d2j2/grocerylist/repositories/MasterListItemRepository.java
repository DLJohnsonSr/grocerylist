package com.d2j2.grocerylist.repositories;

import com.d2j2.grocerylist.entities.MasterListItem;
import org.springframework.data.repository.CrudRepository;

public interface MasterListItemRepository extends CrudRepository<MasterListItem, Long> {
}
