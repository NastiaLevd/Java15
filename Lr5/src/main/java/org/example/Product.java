package org.example;

public class Product {

    private String name;
    private double price;
    private int quantity;

    public String getName() { return name; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }

    public Product(String name, double price, int quantity){
        this.name= name;
        this.price=price;
        this.quantity=quantity;
    }

    public double totalCost(){
        return this.price* this.quantity;
    }
    @Override
    public String toString(){
        return "Имя: " + name + "\nЦена "+ price + "\nКолличество "+ quantity;
    }
}
