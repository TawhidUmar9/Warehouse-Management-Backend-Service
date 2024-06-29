package com.warehousemanagement.app.entity;

import jakarta.persistence.*;

@Entity
@Table
public class Orders {
    @Id
    @SequenceGenerator(
            name = "order_sequence",
            sequenceName = "order_sequence",
            allocationSize = 1)
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "order_sequence")

    @Column(nullable = false, unique = true)
    private Long orderId;
    @Column(nullable = false)
    private Long itemId;
    @Column(nullable = false)
    private Integer itemQuantity;
    @Column(nullable = false)
    private Long storeId;

    public Orders() {
    }

    public Orders(Long itemId, Integer itemQuantity, Long storeID) {
        this.itemId = itemId;
        this.itemQuantity = itemQuantity;
        this.storeId = storeID;
    }

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public Integer getItemQuantity() {
        return itemQuantity;
    }

    public void setItemQuantity(Integer itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    public Long getStoreId() {
        return storeId;
    }

    public void setStoreId(Long storeId) {
        this.storeId = storeId;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "orderId=" + orderId +
                ", itemId=" + itemId +
                ", itemQuantity=" + itemQuantity +
                ", storeId=" + storeId +
                '}';
    }
}
