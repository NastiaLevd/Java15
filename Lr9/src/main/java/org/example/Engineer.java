package org.example;

public class Engineer extends Professional{
    private String project;
    public String getProject(){return project;}
    public void setProject(String value){this.project = value;}
    public Engineer(String name, int experience, int rating, String project){
        super(name, experience, rating);
        this.project=project;
    }
    @Override
    public void work(){
        System.out.println("Проектирует системы");
    }
    @Override
    public void getResponsibilities(){
        System.out.println("Проектирование и расчёты\n");

    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Специальность: "+ this.project);
    }
}
