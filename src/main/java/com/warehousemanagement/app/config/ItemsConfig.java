package com.warehousemanagement.app.config;

import com.warehousemanagement.app.entity.Items;
import com.warehousemanagement.app.repo.ItemsRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class ItemsConfig {
@Bean
    CommandLineRunner commandLineRunnerItems(ItemsRepository itemsRepository) {
    return args -> {
        Items shahCement = new Items(
                "Shah Cement",
                "50 KG bags of Shah Cement",
                10,
                500);
        Items crownCement = new Items(
                "Crown Cement",
                "50 KG bags of Crown Cement",
                20,
                600);
        Items akijCement = new Items(
                "Akij Cement",
                "50 KG bags of Akij Cement",
                40,
                700);
        itemsRepository.saveAll(List.of(shahCement, crownCement, akijCement));

        };
    }
}
