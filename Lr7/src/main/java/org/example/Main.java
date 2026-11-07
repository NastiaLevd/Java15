package org.example;

public class Main {
    public static void main(String[] args) {

        Athlete athlete1 = new Athlete("Иван", "Футбол", 5);
        Athlete athlete2 = new Athlete("Максим", "Бокс", 3);
        Athlete athlete3 = new Athlete("Анна", "Теннис", 7);
        Athlete athlete4 = new Athlete("Олег", "Плавание", 4);
        Athlete athlete5 = new Athlete("Мария", "Гимнастика", 6);

        System.out.println("Количество спортсменов: " + Athlete.totalAthletes);
        System.out.println("Всего медалей: " + Athlete.totalMedals);
        System.out.println("Среднее число медалей: " + Athlete.getAverageMedals());

    }
}