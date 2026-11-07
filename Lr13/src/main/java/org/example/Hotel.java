package org.example;

public class Hotel {
    private String name;
    private String city;
    private int stars;
    private int rooms;
    private int availableRooms;

    public Hotel(String name, String city, int stars, int rooms, int availableRooms) throws InvalidHotelDataException {
        setName(name);
        setCity(city);
        setStars(stars);
        setRooms(rooms);
        setAvailableRooms(availableRooms);
    }

    public void setName(String name) throws InvalidHotelDataException {
        if (name == null || name.trim().isEmpty()) {
            throw new InvalidHotelDataException("Ошибка: название отеля не может быть пустым");
        }
        this.name = name;
    }

    public void setCity(String city) throws InvalidHotelDataException {
        if (city == null || city.trim().isEmpty()) {
            throw new InvalidHotelDataException("Ошибка: город не может быть пустым");
        }
        this.city = city;
    }

    public void setStars(int stars) throws InvalidHotelDataException {
        if (stars < 1 || stars > 5) {
            throw new InvalidHotelDataException("Ошибка: количество звезд должно быть от 1 до 5 (передано: " + stars + ")");
        }
        this.stars = stars;
    }

    public void setRooms(int rooms) throws InvalidHotelDataException {
        if (rooms <= 0) {
            throw new InvalidHotelDataException("Ошибка: общее количество комнат должно быть больше 0");
        }
        if (availableRooms > rooms) {
            throw new InvalidHotelDataException(
                    "Ошибка: общее количество комнат (" + rooms +
                            ") не может быть меньше текущего количества свободных (" + availableRooms + ")");
        }
        this.rooms = rooms;
    }

    public void setAvailableRooms(int availableRooms) throws InvalidHotelDataException {
        if (availableRooms < 0 || availableRooms > rooms) {
            throw new InvalidHotelDataException("Ошибка: некорректное количество свободных комнат");
        }
        this.availableRooms = availableRooms;
    }

    public void bookRoom() throws RoomNotAvailableException {
        if (availableRooms <= 0) {
            throw new RoomNotAvailableException("В отеле \"" + name + "\" нет свободных комнат!");
        }
        availableRooms--;
        System.out.println("Бронь успешна в \"" + name + "\". Осталось свободных комнат: " + availableRooms);
    }

    public void checkOut() throws InvalidHotelDataException {
        if (availableRooms >= rooms) {
            throw new InvalidHotelDataException("Ошибка выселения: в отеле \"" + name + "\" и так все комнаты свободны!");
        }
        availableRooms++;
        System.out.println("Выселение из \"" + name + "\" прошло успешно. Свободных комнат: " + availableRooms);
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public int getStars() {
        return stars;
    }

    public int getRooms() {
        return rooms;
    }

    public int getAvailableRooms() {
        return availableRooms;
    }

    @Override
    public String toString() {
        return name + " (" + city + ", " + stars + "*) — свободно " + availableRooms + " из " + rooms;
    }
}