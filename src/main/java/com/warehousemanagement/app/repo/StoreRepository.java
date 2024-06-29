package com.warehousemanagement.app.repo;

import com.warehousemanagement.app.entity.Store;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StoreRepository extends JpaRepository<Store, Long>{
}
