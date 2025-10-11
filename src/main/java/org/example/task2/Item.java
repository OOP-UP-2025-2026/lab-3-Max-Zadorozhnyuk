package org.example.task2;

public class Item {

    private long id;
    private String name;
    private double price;

    public Item(long id, String name, double price) {
        this.setId(id);
        this.setName(name);
        this.setPrice(price);
    }

    // --- Геттери ---
    public long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    // --- Сеттери ---
    public void setId(long id) {
        if (id <= 0) throw new IllegalArgumentException("ID має бути більше 0");
        this.id = id;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty())
            throw new IllegalArgumentException("Назва не може бути порожньою");
        this.name = name;
    }

    public void setPrice(double price) {
        if (price <= 0) throw new IllegalArgumentException("Ціна має бути більшою за 0");
        this.price = price;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + this.id +
                ", name='" + this.name + '\'' +
                ", price=" + this.price +
                '}';
    }
}