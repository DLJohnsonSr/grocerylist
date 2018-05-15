package com.d2j2.grocerylist.repositories;

import com.d2j2.grocerylist.entities.MasterList;
import org.springframework.data.repository.CrudRepository;

public interface MasterListRepository extends CrudRepository<MasterList, Long> {
}
