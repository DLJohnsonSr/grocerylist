package com.d2j2.grocerylist.entities;

import javax.persistence.*;

@Entity
public class GroceryStoreItem {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private boolean inStock;
    private String productName;
    private String unit;
    private double suggestedPrice;
    private double actualPrice;
    @ManyToOne
    @JoinColumn
    private GroceryStoreList groceryStoreList;
    public GroceryStoreItem() {
        this.productName = productName;
        this.unit = unit;
        this.suggestedPrice = suggestedPrice;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean isInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
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

    public double getActualPrice() {
        return actualPrice;
    }

    public void setActualPrice(double actualPrice) {
        this.actualPrice = actualPrice;
    }

    public GroceryStoreList getGroceryStoreList() {
        return groceryStoreList;
    }

    public void setGroceryStoreList(GroceryStoreList groceryStoreList) {
        this.groceryStoreList = groceryStoreList;
    }
}
