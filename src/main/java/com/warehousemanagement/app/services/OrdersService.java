package com.warehousemanagement.app.services;

import com.warehousemanagement.app.entity.Orders;
import com.warehousemanagement.app.repo.OrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdersService {
    private final OrdersRepository ordersRepository;

    @Autowired
    public OrdersService(OrdersRepository ordersRepository) {
        this.ordersRepository = ordersRepository;
    }

    public List<Orders>getAllOrders(){
        return ordersRepository.findAll();
    }
}
