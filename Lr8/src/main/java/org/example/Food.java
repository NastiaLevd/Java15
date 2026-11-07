package org.example;

public class Food {
    private String name;
    private double calories;
    private int cookingTime;


    public String getName(){
        return name;
    }
    public void setName(String value){
        name=value;
    }
    public double getCalories(){
        return calories;
    }
    public void setCalories(double value){
        calories=value;
    }
    public int getCookingTime(){
        return cookingTime;
    }
    public void setCookingTime(int value){
        cookingTime=value;
    }
    public Food(String name, double calories, int cookingTime){
        this.name=name;
        this.calories=calories;
        this.cookingTime=cookingTime;
    }
    public void сook(){
        System.out.println("Способ приготовления: Неизвестно");
    }
    public void displayInfo(){
        System.out.println("Название: "+ getName()+ "\nКалории: "+ getCalories()+ " ккал"+ "\nВремя готовки: "+ getCookingTime()+ " мин.");
    }
}
