package org.example;

public class Film {
    protected String title;
    protected int id;
    protected int duration;

    public Film(String title, int id, int duration) {
        this.title = title;
        this.id = id;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Длительность: " + duration + " мин.";
    }
}
