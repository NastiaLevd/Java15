package org.example;

public class Comedy extends Film{
    private double funnyRating;

    public Comedy(String title, int id, int duration, double funnyRating) {
        super(title, id, duration);
        this.funnyRating = funnyRating;
    }

    @Override
    public String toString() {
        return "[Comedy] " + super.toString() + ", Рейтинг юмора: " + funnyRating;
    }
}
