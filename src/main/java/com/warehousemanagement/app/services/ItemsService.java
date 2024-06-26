package com.warehousemanagement.app.services;

import com.warehousemanagement.app.entity.Items;
import com.warehousemanagement.app.repo.ItemsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
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

    public List<Items> getItemByName(String itemName) {
        return itemsRepository.findItemsByName(itemName);
    }

    public List<Items> getSortedItems(String sortBy) {
        return itemsRepository.findAll(Sort.by(sortBy));
    }

    public void deleteItem(Long id) {
        itemsRepository.deleteById(id);
    }

}
