package ru.bvkuchin.springbootstart.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import ru.bvkuchin.springbootstart.models.Product;
import ru.bvkuchin.springbootstart.repositories.InMemProductRepository;

@Controller
public class ProductController {

    InMemProductRepository repository;

    @Autowired
    public void setRepository(InMemProductRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/products")
    public String test(Model model) {
        model.addAttribute("products", repository.getAllProducts());
        return "products";
    }


    @GetMapping("/product/{id}")
    public String test(Model model, @PathVariable int id) {
        Product product = repository.findById(id);
        model.addAttribute("product", product);
        return "product";
    }


}
