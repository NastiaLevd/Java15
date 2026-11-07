package org.example;

public class Action extends Film{
    private int explosions;

    public Action(String title, int id, int duration, int explosions) {
        super(title, id, duration);
        this.explosions = explosions;
    }

    @Override
    public String toString() {
        return "[Action] " + super.toString() + ", Взрывов: " + explosions;
    }
}
