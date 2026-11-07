package org.example;

public class Athlete {
    private String name;
    private String sport;
    private int medals;
    static int totalAthletes =0;
    static int totalMedals =0;



public Athlete(String name, String sport, int medals){
    this.name = name;
    this.sport=sport;
    this.medals = medals;
    totalAthletes++;
    totalMedals+=medals;
}
    public static void Print(){
System.out.println("Количество медалей: "+ totalMedals);
    }

    public static double getAverageMedals() {
        if (totalAthletes == 0) {
            return 0;
        }

        return (double) totalMedals / totalAthletes;
    }
}
