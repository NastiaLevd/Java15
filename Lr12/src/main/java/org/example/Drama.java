package org.example;

public class Drama extends Film{
    private int oscars;

    public Drama(String title, int id, int duration, int oscars) {
        super(title, id, duration);
        this.oscars = oscars;
    }

    @Override
    public String toString() {
        return "[Drama] " + super.toString() + ", Оскаров: " + oscars;
    }
}
