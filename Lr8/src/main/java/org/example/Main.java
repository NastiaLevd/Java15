package org.example;

public class Main {
    public static void main(String[] args){
        Food[] foods = new Food[5];
        foods[0] = new Pizza("Пепперони", 850, 20, "Колбаски");
        foods[1]=new Pizza("Маргарита", 700, 15, "Сыр");
        foods[2] = new Pizza("Четыре сыра", 900, 25, "Сыр моцарелла");
        foods[3] = new Salad("Цезарь", 350, 10, "Соус Цезарь");
        foods[4] = new Salad("Греческий", 250, 8, "Оливковое масло");

        if(foods[0] instanceof Pizza){
            Pizza pizza = (Pizza) foods[0];
            pizza.addTopping("Дополнительный сыр");    }
        if (foods[3] instanceof Salad) {
            Salad salad = (Salad) foods[3];
            salad.addDressing("Сырный соус");
        }
        for(Food food: foods){
            food.displayInfo();
            food.сook();
        }
    }
}
