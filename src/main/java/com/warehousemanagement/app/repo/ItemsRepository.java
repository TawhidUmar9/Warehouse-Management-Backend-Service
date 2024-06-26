package com.warehousemanagement.app.repo;

import com.warehousemanagement.app.entity.Items;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ItemsRepository extends JpaRepository<Items, Long> {

    @Query("SELECT i FROM Items i WHERE LOWER(TRIM(i.itemName)) LIKE LOWER(TRIM(CONCAT('%', ?1, '%')))")
    List<Items> findItemsByName(String itemName);


}
