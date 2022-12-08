package ru.bvkuchin.springbootstart.models;

public class Product {

    private long id;
    private String name;
    private double cost;

    public Product() {
    }

    public Product(long id, String name, double cost) {
        this.id = id;
        this.name = name;
        this.cost = cost;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "Product" + id +
                " " + name + '\'' +
                ", cost: " + cost ;
    }
}
