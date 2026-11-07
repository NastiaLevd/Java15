package org.example;

public class Main {
    public static void main(String[] args) {
        Buildable[] buildings = {
                new ResidentialBuilding("ул. Ленина, 1", 9, 36),
                new ResidentialBuilding("ул. Мира, 5", 5, 20),
                new ResidentialBuilding("ул. Пушкина, 10", 16, 64),
                new OfficeBuilding("б-р Строителей, 12", 12, 10),
                new OfficeBuilding("пр. Деловой, 3", 22, 25)};
        for (Buildable b : buildings) {
            b.build();
            System.out.println("Этажей: " + b.getFloors());

            if (b instanceof Habitable) {
                Habitable h = (Habitable) b;
                h.live();
                System.out.println("Вместимость: " + h.getCapacity() + " человек\n");
            }
        }
    }
}
