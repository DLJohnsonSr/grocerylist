package com.d2j2.grocerylist.entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class MasterListItem {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String productName;
    private String unit;
    private double suggestedPrice;
    @ManyToMany(mappedBy = "masterListItems")
    private Set<MasterList>masterLists;

    public MasterListItem() {
        this.productName = productName;
        this.unit = unit;
        this.suggestedPrice = suggestedPrice;
        this.masterLists = new HashSet<>();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public double getSuggestedPrice() {
        return suggestedPrice;
    }

    public void setSuggestedPrice(double suggestedPrice) {
        this.suggestedPrice = suggestedPrice;
    }

    public Set<MasterList> getMasterLists() {
        return masterLists;
    }

    public void setMasterLists(Set<MasterList> masterLists) {
        this.masterLists = masterLists;
    }

    public void addMasterLists(MasterList masterList){
        masterLists.add(masterList);
    }
}
