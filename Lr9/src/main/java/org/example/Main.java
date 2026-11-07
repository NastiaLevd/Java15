package org.example;

import javax.print.Doc;

public class Main {
    public static void main(String[] args){
    Professional[] professionals = new Professional[5];
    professionals[0] = new Doctor("Анна", 5, 4, "Хирург");
    professionals[1] = new Doctor("Виктор", 2, 14, "Медбрат");
    professionals[2] = new Doctor("Данута", 30, 1, "Офтальмолог");
    professionals[3] = new Engineer("Сейгей", 7, 3, "Электро оборудование");
    professionals[4] = new Engineer("Василий", 35, 1, "Сельхоз оборудование");

    for(Professional pr:professionals ){

        pr.displayInfo();
        pr.work();
        pr.getResponsibilities();
    }
}}
