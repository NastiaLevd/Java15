package org.example;

import javax.print.Doc;

public class Doctor extends Professional{
private String specialization;
public String getSpecialization(){return specialization;}
public void setSpecialization(String value){this.specialization = value;}
public Doctor(String name, int experience, int rating, String specialization){
    super(name, experience, rating);
    this.specialization=specialization;
}
    @Override
    public void work(){
System.out.println("Лечит пациентов");
    }
    @Override
    public void getResponsibilities(){
    System.out.println("Диагностика и лечение\n");

    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Специальность: "+ this.specialization);
    }
}
