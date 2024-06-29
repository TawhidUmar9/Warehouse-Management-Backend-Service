package com.warehousemanagement.app.controller;

import com.warehousemanagement.app.entity.Store;
import com.warehousemanagement.app.services.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/stores")
public class StoreContorller {
    private final StoreService storeService;
    @Autowired
    public StoreContorller(StoreService storeService) {
        this.storeService = storeService;
    }
    @GetMapping
    public List<Store> getAllStore(){
        return storeService.getAllStores();
    }
}
