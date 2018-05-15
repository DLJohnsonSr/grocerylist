package com.d2j2.grocerylist.entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class CustomerListItem {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String productName;
    private String unit;
    private double lowestPrice;
    private String location;

    @ManyToMany(mappedBy = "customerListItems")
    private Set<CustomerGroceryList>customerGroceryLists;


    public CustomerListItem() {
        this.productName = productName;
        this.customerGroceryLists = new HashSet<>();
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

    public double getLowestPrice() {
        return lowestPrice;
    }

    public void setLowestPrice(double lowestPrice) {
        this.lowestPrice = lowestPrice;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Set<CustomerGroceryList> getCustomerGroceryLists() {
        return customerGroceryLists;
    }

    public void setCustomerGroceryLists(Set<CustomerGroceryList> customerGroceryLists) {
        this.customerGroceryLists = customerGroceryLists;
    }

    public void addCustomerGroceryLists(CustomerGroceryList customerGroceryList){
        this.customerGroceryLists.add(customerGroceryList);
    }
}
