package org.example;

public class Pizza extends Food {
    private String toppings;
    public String getToppings(){
        return toppings;
    }
    public void setToppings(String value){
        toppings=value;
    }
    public Pizza(String name, double calories, int cookingTime,String toppings){
        super(name,calories,cookingTime);
        this.toppings=toppings;
    }

    @Override
    public void сook() {
        System.out.println("Способ приготовления: Запекается в духовке\n");
    }
    public void addTopping(String topping){
        if(toppings == null || toppings.isEmpty()){
            toppings=topping;
        }
        else{
            toppings += ", "+topping;
        }
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Начинки: "+ toppings);
    }
}
