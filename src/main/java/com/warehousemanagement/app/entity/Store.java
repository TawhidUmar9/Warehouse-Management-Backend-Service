package com.warehousemanagement.app.entity;

import jakarta.persistence.*;

@Entity
@Table
public class Store {
    @Id
    @SequenceGenerator(
            name = "store_sequence",
            sequenceName = "store_sequence",
            allocationSize = 1)
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "store_sequence")
    @Column(unique = true,nullable = false)
    private Long storeId;
    @Column(nullable = false)
    private String storeName;
    @Column(nullable = false)
    private String storeLocation;

    public Store() {
    }

    public Store( String storeName, String storeLocation) {
        this.storeName = storeName;
        this.storeLocation = storeLocation;
    }

    public Long getStoreId() {
        return storeId;
    }

    public void setStoreId(Long storeId) {
        this.storeId = storeId;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getStoreLocation() {
        return storeLocation;
    }

    public void setStoreLocation(String storeLocation) {
        this.storeLocation = storeLocation;
    }

    @Override
    public String toString() {
        return "Store{" +
                "storeId=" + storeId +
                ", storeName='" + storeName + '\'' +
                ", storeLocation='" + storeLocation + '\'' +
                '}';
    }
}
