package org.example;

public class Hotel {
    private String name;
    private int stars;
    private double pricePerNight;

    public Hotel(String name, int stars, double pricePerNight) {
        this.name = name;
        this.stars = stars;
        this.pricePerNight = pricePerNight;
    }

    public String getName() { return name; }
    public int getStars() { return stars; }
    public double getPricePerNight() { return pricePerNight; }

    @Override
    public String toString() {
        return name + " (" + stars + "★, " + pricePerNight + " руб/ночь)";
    }
}