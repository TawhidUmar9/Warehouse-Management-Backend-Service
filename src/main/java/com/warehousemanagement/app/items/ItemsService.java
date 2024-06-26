package com.warehousemanagement.app.items;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemsService {
    private final ItemsRepository itemsRepository;

    @Autowired
    public ItemsService(ItemsRepository itemsRepository) {
        this.itemsRepository = itemsRepository;
    }

    public List<Items>getAllItems() {
    return itemsRepository.findAll();
    }

    public void addNewItem(Items item) {
        //checking korbo, if age theke exist kore, then just update kore dibo.
        itemsRepository.save(item);
    }

    public List<Items> getItem(String itemName) {
        return itemsRepository.findItemByName(itemName);
    }
}
