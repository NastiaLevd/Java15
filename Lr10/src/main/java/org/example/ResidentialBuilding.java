package org.example;

public class ResidentialBuilding implements Buildable,Habitable{
    private String address;
    private int floors;
    private int apartments;

    public ResidentialBuilding(String address, int floors,int apartments){
        this.address=address;
        this.floors=floors;
        this.apartments=apartments;

    }
    public void build(){
        System.out.println("Строительство жилого дома по адресу: " );
    }
    public int getFloors(){
        return floors;
    }
    public void live() {
        System.out.println("Заселение жилого дома. Квартир: " + apartments);
    }

    public int getCapacity() {
        return apartments * 3;
    }
}
