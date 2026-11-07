package org.example;

public class Laptop {
    private String brand;
    private int ram;
    private int storage;
    private double price;
private double quantity;


public double getQuantity(){
    return quantity;
    }

    public void setQuantity(double value){
    quantity = value;
    }

    public Laptop(String brand, int ram, int storage, double price, double quantity){
    this(brand,ram,storage,price);
    this.quantity=quantity;
    }





















    public String getBrand(){
        return brand;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
    public int getRam(){
        return ram;
    }
    public void setRam(int ram){
        this.ram = ram;
    }
    public int getStorage(){
        return storage;
    }
    public void setStorage(int storage){
        this.storage = storage;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public Laptop(String brand, int ram, int storage, double price) {
        this.brand = brand;
        this.ram = ram;
        this.storage = storage;
        this.price = price;
    }
    public void applyDiscount(int percent){
        this.price-=this.price* percent/100.0;
    }
    public void showInfo() {
        System.out.println("Ноутбук: " + brand);
        System.out.println("Оперативная память: " + ram + " ГБ");
        System.out.println("Накопитель: " + storage + " ГБ");
        System.out.println("Цена: " + price + " руб.");
    }
}
