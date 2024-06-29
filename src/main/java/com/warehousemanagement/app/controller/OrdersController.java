package com.warehousemanagement.app.controller;

import com.warehousemanagement.app.DTO.DTO;
import com.warehousemanagement.app.entity.Items;
import com.warehousemanagement.app.entity.Orders;
import com.warehousemanagement.app.entity.Store;
import com.warehousemanagement.app.services.ItemsService;
import com.warehousemanagement.app.services.OrdersService;
import com.warehousemanagement.app.services.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/orders")
public class OrdersController {
    private final OrdersService ordersService;
    private final StoreService storeService;
    private final ItemsService itemsService;

    @Autowired
    public OrdersController(OrdersService ordersService,
                            StoreService storeService,
                            ItemsService itemsService) {
        this.ordersService = ordersService;
        this.storeService = storeService;
        this.itemsService = itemsService;
    }

    @GetMapping
    public List<DTO> getAllOrders() {
        List<DTO> dtoList = new ArrayList<>();
        List<Orders> ordersList= ordersService.getAllOrders();
        for(Orders orders: ordersList){
            //we take each order.
            Long storeId = orders.getStoreId();
            Long itemId = orders.getItemId();
            //we get the store name and item name from the store and item services.
            Store store = storeService.getStoreById(storeId);
            Items items = itemsService.getItemById(itemId);

            //we create a DTO object and set the values.
            DTO dto = new DTO();
            dto.setOrders(orders);
            dto.setItems(items);
            dto.setStore(store);
            dtoList.add(dto);
        }

        return dtoList;
    }

}
