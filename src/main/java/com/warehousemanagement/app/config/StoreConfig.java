package com.warehousemanagement.app.config;

import com.warehousemanagement.app.entity.Store;
import com.warehousemanagement.app.repo.StoreRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;


@Configuration
public class StoreConfig {
    @Bean
    CommandLineRunner commandLineRunnerStore(StoreRepository storeRepository){
        return args -> {
            Store store1 = new Store(
                    "Store 1",
                    "123 Main St");
            Store store2 = new Store("Store 2",
                    "456 Elm St");
            Store store3 = new Store("Store 3",
                    "789 Maple St");
            storeRepository.saveAll(List.of(store1, store2, store3));
        };
    }
}
