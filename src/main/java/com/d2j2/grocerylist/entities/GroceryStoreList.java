package com.d2j2.grocerylist.entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class GroceryStoreList {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @OneToOne (mappedBy = "groceryStoreList")
    private GroceryStore groceryStore;
    @OneToMany(mappedBy = "groceryStoreList")
    private Set<GroceryStoreItem>groceryStoreItems;

    public GroceryStoreList() {
        this.groceryStore = groceryStore;
        this.groceryStoreItems = new HashSet<>();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public GroceryStore getGroceryStore() {
        return groceryStore;
    }

    public void setGroceryStore(GroceryStore groceryStore) {
        this.groceryStore = groceryStore;
    }

    public Set<GroceryStoreItem> getGroceryStoreItems() {
        return groceryStoreItems;
    }

    public void setGroceryStoreItems(Set<GroceryStoreItem> groceryStoreItems) {
        this.groceryStoreItems = groceryStoreItems;
    }

}
