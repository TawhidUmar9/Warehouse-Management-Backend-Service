package com.warehousemanagement.app.items;

import jakarta.persistence.*;

@Entity
@Table
public class Items {

    @Id
    @SequenceGenerator(
            name = "item_sequence",
            sequenceName = "item_sequence",
            allocationSize = 1)
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "item_sequence")

    @Column(nullable = false, unique = true)
    private Long id;
    @Column(nullable = false)
    private String itemName;
    private String itemDescription;
    private Integer itemQuantity;
    private Double itemPrice;

    public Items(String itemName, String itemDescription, int itemQuantity, double itemPrice) {
        this.itemName = itemName;
        this.itemDescription = itemDescription;
        this.itemQuantity = itemQuantity;
        this.itemPrice = itemPrice;
    }

    public Items() {
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public Integer getItemQuantity() {
        return itemQuantity;
    }

    public void setItemQuantity(Integer itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    public Double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(Double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
