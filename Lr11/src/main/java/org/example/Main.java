package org.example;

public class Main {
    public static void main(String[] args) {
        Actor actor = new Actor("Иван", 17, "Драма");
        Singer singer = new Singer("Анна", 28, "Поп", 4);
        Dancer dancer = new Dancer("Максим", 24, "Хореография", "Хип-хоп");

        actor.perform();
        actor.perform("Ромео");
        actor.perform(3);

        Actor a1 = new Actor("Петр", 40, "Кино");
        Actor a2 = new Singer("Елена", 30, "Эстрада", 2);
        Actor a3 = new Dancer("Ольга", 22, "Балет", "Классический");
System.out.println("\n");
        a1.getAwards();
        a2.getAwards();
        a3.getAwards(); }
}
