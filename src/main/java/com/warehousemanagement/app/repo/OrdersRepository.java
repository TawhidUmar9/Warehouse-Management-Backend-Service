package com.warehousemanagement.app.repo;

import com.warehousemanagement.app.entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdersRepository extends JpaRepository<Orders, Long> {

}
