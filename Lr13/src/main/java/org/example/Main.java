package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static Hotel findHotel(List<Hotel> hotels, String name) throws HotelNotFoundException {
        for (Hotel h : hotels) {
            if (h.getName().equalsIgnoreCase(name)) {
                return h;
            }
        }
        throw new HotelNotFoundException("Отель с названием \"" + name + "\" не найден в системе!");
    }

    public static void main(String[] args) {
        List<Hotel> hotels = new ArrayList<>();

        try {
            hotels.add(new Hotel("Grand Plaza", "Минск", 5, 10, 1));
            hotels.add(new Hotel("Cozy Inn", "Гродно", 3, 20, 5));

            hotels.add(new Hotel("Bad Hotel", "Брест", 7, 10, 10));
        } catch (InvalidHotelDataException e) {
            System.out.println("Перехвачено исключение при создании: " + e.getMessage());
        }

        try {
            Hotel plaza = findHotel(hotels, "Grand Plaza");
            System.out.println("\nСтатус: " + plaza);

            plaza.bookRoom();
            plaza.checkOut();
            plaza.bookRoom();

            plaza.bookRoom();

        } catch (HotelNotFoundException | RoomNotAvailableException | InvalidHotelDataException e) {
            System.out.println("Перехвачено исключение при операции: " + e.getMessage());
        }

        try {
            System.out.println();
            Hotel unknown = findHotel(hotels, "Atlantis");
            unknown.bookRoom();
        } catch (HotelNotFoundException | RoomNotAvailableException e) {
            System.out.println("Перехвачено исключение поиска: " + e.getMessage());
        }
    }
}