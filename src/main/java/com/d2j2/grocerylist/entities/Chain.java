package com.d2j2.grocerylist.entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Chain {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String chainName;

    @OneToMany(mappedBy = "chain")
    private Set<GroceryStore> groceryStores;

    @OneToOne
    @JoinColumn
    private MasterList masterList;

    public Chain() {
        this.chainName = chainName;
        this.groceryStores = new HashSet<>();
    }

    public Chain(String chainName) {
        this.chainName = chainName;
        this.groceryStores = new HashSet<>();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getChainName() {
        return chainName;
    }

    public void setChainName(String chainName) {
        this.chainName = chainName;
    }

    public Set<GroceryStore> getGroceryStores() {
        return groceryStores;
    }

    public void setGroceryStores(Set<GroceryStore> groceryStores) {
        this.groceryStores = groceryStores;
    }

    public MasterList getMasterList() {
        return masterList;
    }

    public void setMasterList(MasterList masterList) {
        this.masterList = masterList;
    }

    public void addStores(GroceryStore groceryStore){
        this.groceryStores.add(groceryStore);
    }

    public void findNumberStores(){

    }
}
