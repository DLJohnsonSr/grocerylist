package com.d2j2.grocerylist.entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class CustomerGroceryList {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne
    @JoinColumn
    private AppUser appUser;

    @ManyToMany
    @JoinTable
    private Set<CustomerListItem>customerListItems;

    public CustomerGroceryList() {
        this.appUser = appUser;
        this.customerListItems = new HashSet<>();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public AppUser getAppUser() {
        return appUser;
    }

    public void setAppUser(AppUser appUser) {
        this.appUser = appUser;
    }

    public Set<CustomerListItem> getCustomerListItems() {
        return customerListItems;
    }

    public void setCustomerListItems(Set<CustomerListItem> customerListItems) {
        this.customerListItems = customerListItems;
    }
    public void addCustomerGroceryItems(CustomerListItem customerListItem){
        this.customerListItems.add(customerListItem);
    }
}
