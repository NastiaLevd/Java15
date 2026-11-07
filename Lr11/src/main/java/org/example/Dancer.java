package org.example;

public class Dancer extends Actor{
    private String style;
    public Dancer(String name, int age, String genre, String style){
        super(name,age,genre);
        this.style=style;
    }
    public void getAwards(){
        System.out.println("3 награды");
    }
}
