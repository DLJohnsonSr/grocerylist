package com.d2j2.grocerylist.entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class GroceryStore {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String storeName;
    private String address;
    private String city;
    private String state;
    private String zipCode;
    @ManyToMany(mappedBy = "customerGroceryStores")
    private Set<AppUser>storeCustomers;
    @OneToOne
    @JoinColumn
    private GroceryStoreList groceryStoreList;

    public GroceryStore() {
        this.storeName = storeName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.storeCustomers = new HashSet();
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public Set<AppUser> getStoreCustomers() {
        return storeCustomers;
    }

    public void setStoreCustomers(Set<AppUser> storeCustomers) {
        this.storeCustomers = storeCustomers;
    }

    public GroceryStoreList getGroceryStoreList() {
        return groceryStoreList;
    }

    public void setGroceryStoreList(GroceryStoreList groceryStoreList) {
        this.groceryStoreList = groceryStoreList;
    }

    public void addStoreCustomers(AppUser appUser){
        this.storeCustomers.add(appUser);
    }
}
