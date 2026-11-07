package org.example;

public class Main {

    public static void main(String[] args) {
        Product[] products = new Product[]{
                new Product("Ноутбук", 3000, 1),
                new Product("Клавиатура", 500, 2),
                new Product("Мышка", 300, 3),
                new Product("Xbox", 4000, 1),
                new Product("Наушники", 1000, 1)
        };

        for (Product p : products) {
            //System.out.println(p.getName() + " — " + p.totalCost());
            System.out.println(p);
        }





        Hotel[] hotels = new Hotel[]{
                new Hotel("Hilton",       5, 25000),
                new Hotel("Marriott",     4, 18000),
                new Hotel("Ибис",         3, 7000),
                new Hotel("Хостел Ленина", 2, 1500),
                new Hotel("Ritz",         5, 40000),
                new Hotel("Cosmos",       4, 12000)
        };

        Hotel maxStars = hotels[0];
        for (Hotel h : hotels) {
            if (h.getStars() > maxStars.getStars()) {
                maxStars = h;
            }
        }

        Hotel mostExpensive = hotels[0];
        for (Hotel h : hotels) {
            if (h.getPricePerNight() > mostExpensive.getPricePerNight()) {
                mostExpensive = h;
            }
        }

        System.out.println("\n \nОтель с максимальным количеством звёзд: " + maxStars);
        System.out.println("Самый дорогой отель: " + mostExpensive);



        Book[] books = new Book[]{
                new Book("Властелин колец", Genre.FANTASY),
                new Book("1984", Genre.FICTION),
                new Book("Сапиенс", Genre.HISTORY),
                new Book("Краткая история времени", Genre.SCIENCE),
                new Book("Хоббит", Genre.FANTASY)
        };

        System.out.println("\n \n Книги жанра FANTASY:");
        for (Book b : books) {
            if (b.getGenre() == Genre.FANTASY) {
                System.out.println(b.getTitle());
            }
        }
    }
}