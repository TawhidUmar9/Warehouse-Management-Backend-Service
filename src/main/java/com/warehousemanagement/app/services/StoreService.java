package com.warehousemanagement.app.services;

import com.warehousemanagement.app.entity.Store;
import com.warehousemanagement.app.repo.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoreService {
    private final StoreRepository storeRepository;
    @Autowired
    public StoreService(StoreRepository storeRepository) {
        this.storeRepository = storeRepository;
    }

    public List<Store> getAllStores(){
        return storeRepository.findAll();
    }
    public Store getStoreById(Long id){
        return storeRepository.findById(id).orElse(null);
    }

}
