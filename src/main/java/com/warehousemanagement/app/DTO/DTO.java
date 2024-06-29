package com.warehousemanagement.app.DTO;

import com.warehousemanagement.app.entity.Items;
import com.warehousemanagement.app.entity.Orders;
import com.warehousemanagement.app.entity.Store;

public class DTO {
    private Orders orders;
    private Items items;
    private Store store;

    public DTO() {
    }

    public DTO(Items items, Store store, Orders orders) {
        this.items = items;
        this.store = store;
        this.orders = orders;
    }

    public Orders getOrders() {
        return orders;
    }

    public void setOrders(Orders orders) {
        this.orders = orders;
    }

    public Items getItems() {
        return items;
    }

    public void setItems(Items items) {
        this.items = items;
    }

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }

    @Override
    public String toString() {
        return "DTO{" +
                "orders=" + orders +
                ", items=" + items +
                ", store=" + store +
                '}';
    }
}
