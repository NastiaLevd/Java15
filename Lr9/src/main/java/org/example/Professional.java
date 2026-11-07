package org.example;

public abstract class Professional {
    private String name;
    private int experience;
    private int rating;

    public Professional(String name, int experience, int rating){
        this.name = name;
        this.experience = experience;
        this.rating = rating;
    }

    public String getName(){
        return name;
    }
    public void setName(String value){
        this.name = value;
    }
    public int getExperience(){
        return experience;
    }
    public void setExperience(int value){
        this.experience = value;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int value) {
        this.rating = value;
    }
    public abstract void work();
    public abstract void getResponsibilities();
    public void displayInfo(){
        System.out.println("Имя: "+ this.name + "\nОпыт: "+ this.experience+ "\nРейтинг: "+ this.rating);
    }
}
