package com.warehousemanagement.app.items;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/items")
public class ItemsController {
    private final ItemsService itemsService;

    @Autowired
    public ItemsController(ItemsService itemsService) {
        this.itemsService = itemsService;
    }

    @GetMapping
    public List getAllItems() {
        return itemsService.getAllItems();
    }

    @GetMapping(params = "itemName")
    public List<Items> getItem(@RequestParam String itemName) {
        return itemsService.getItem(itemName);
    }

    @PostMapping
    public void addItems(@RequestBody Items newItem) {
        itemsService.addNewItem(newItem);
    }



}
