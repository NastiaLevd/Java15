package org.example;

public class Main {

    public static void main(String[] args){
        Laptop laptop = new Laptop("Asus", 32, 512, 2000);

        laptop.showInfo();
        laptop.applyDiscount(13);

        System.out.println("Цена со скидкой: " + laptop.getPrice() + " руб.");
    }
}
