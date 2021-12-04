package EncapsulationExercises.ShoppingSpree;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Person {

    private String name;
    private double money;
    private List<Product> products;

    public Person(String name, double money) {
        this.setName(name);
        this.setMoney(money);
        this.products = new ArrayList<>();
    }

    private void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }

    private void setMoney(double money) {
        if (money < 0) {
            throw new IllegalArgumentException("Money cannot be negative");
        }
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void buyProduct(Product product) {
        if (this.money < product.getCost()){
            throw new IllegalArgumentException(String.format("%s can't afford %s",
                    this.name, product.getName()));
        }
        this.money -= product.getCost();
        products.add(product);
        System.out.printf("%s bought %s%n", this.name, product.getName());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(String.format("%s - ", this.name));
        sb.append(this.products.isEmpty()
                ? "Nothing bought"
                : products.stream().map(Product::getName).collect(Collectors.joining(", ")));

        return sb.toString();
    }
}
