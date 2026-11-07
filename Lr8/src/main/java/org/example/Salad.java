package org.example;

public class Salad extends Food {
    private String dressing;
    public String getDressing(){
        return dressing;
    }
    public void setDressing(String value){
       dressing =value;
    }
    public Salad(String name, double calories, int cookingTime,String dressing){
        super(name,calories,cookingTime);
        this.dressing=dressing;
    }

    @Override
    public void сook() {
                System.out.println("Способ приготовления: Нарезается и смешивается\n");
    }
    public void addDressing(String dressing) {
        if (this.dressing == null || this.dressing.isEmpty()) {
            this.dressing = dressing;
        } else {
            this.dressing += ", " + dressing;
        }
    }
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Заправка: "+ dressing);
    }
}
