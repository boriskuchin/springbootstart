package ru.bvkuchin.springbootstart.repositories;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;
import ru.bvkuchin.springbootstart.models.Product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Component
public class InMemProductRepository {

    private List<Product> products;

    @PostConstruct
    private void init() {
        products = new ArrayList<>(List.of(
                new Product(1L, "Футболка", 100),
                new Product(2L, "Джинсы", 200),
                new Product(3L, "Трусы", 300),
                new Product(4L, "Носки", 400),
                new Product(5L, "Рубашка", 500),
                new Product(6L, "Шорты", 600)
        ));
    }


    public Product findById(long id) {
        return products.stream().filter(product -> product.getId() == id).findFirst().orElseThrow(() -> new RuntimeException());
    }

    public List<Product> getAllProducts() {
        return Collections.unmodifiableList(products);
    }

}
