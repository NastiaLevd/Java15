package org.example;

public class OfficeBuilding implements Buildable, Habitable{
    private String address;
    private int floors;
    private int companies;

    public OfficeBuilding(String address, int floors, int companies) {
        this.address = address;
        this.floors = floors;
        this.companies = companies;
         }
    public void build() {
        System.out.println("Строительство офисного центра по адресу: " + address);
    }
    public int getFloors() {
        return floors;
    }
    public void live() {
        System.out.println("Заполнение офиса компаниями. Арендаторов: " + companies);
    }

    public int getCapacity() {
        return companies * 20;
    }
}
