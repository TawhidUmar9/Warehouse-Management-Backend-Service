package com.warehousemanagement.app.config;

import com.warehousemanagement.app.entity.Orders;
import com.warehousemanagement.app.repo.OrdersRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class OrdersConfig {
    @Bean
    CommandLineRunner commandLineRunnerOrdres(OrdersRepository ordersRepository) {
        return args -> {
            Orders one = new Orders(1L,1,1L);
            Orders two = new Orders(2L,2,2L);
            Orders three = new Orders(3L,3,3L);
            ordersRepository.saveAll(List.of(one, two, three));
        };
    }
}
