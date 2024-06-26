package com.warehousemanagement.app.items;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ItemsRepository extends JpaRepository<Items, Long> {

    @Query("SELECT i FROM Items i WHERE i.itemName LIKE %?1%")
    List<Items> findItemByName(String itemName);

}
