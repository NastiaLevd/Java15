package org.example;

public class Singer extends Actor{
    private int albumsCount;
    public Singer(String name,int age, String genre, int albumsCount){
        super(name, age, genre);
        this.albumsCount=albumsCount;
    }
    public void getAwards(){
        System.out.println("5 наград");
    }
}
