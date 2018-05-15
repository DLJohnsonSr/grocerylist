package com.d2j2.grocerylist.entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class MasterList {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @OneToOne(mappedBy = "masterList")
    private Chain chain;
    @ManyToMany
    @JoinTable
    private Set<MasterListItem> masterListItems;

    public MasterList() {
        this.chain = chain;
        this.masterListItems = new HashSet<>();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Chain getChain() {
        return chain;
    }

    public void setChain(Chain chain) {
        this.chain = chain;
    }

    public Set<MasterListItem> getMasterListItems() {
        return masterListItems;
    }

    public void setMasterListItems(Set<MasterListItem> masterListItems) {
        this.masterListItems = masterListItems;
    }

    public void addMasterListItems(MasterListItem masterListItem){
        this.masterListItems.add(masterListItem);
    }
}
