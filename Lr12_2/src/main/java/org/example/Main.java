package org.example;
import java.util.*;


public class Main {

    public static void printArtists(List<Artist> artists, int rank) {
        for (Artist a : artists) {
            if (a.getRank() == rank) {
                System.out.println(a.getId() + " " + a.getName() + " " + a.getGenre() + " Ранг: " + a.getRank());
            }
        }
    }

    public static void main(String[] args) {
        List<Artist> artists = new ArrayList<>();
        artists.add(new Artist(1, "The Weekend", "Pop", 2, Arrays.asList(5, 4, 5)));
        artists.add(new Artist(2, "Eminem", "Rap", 1, Arrays.asList(4, 4, 4)));
        artists.add(new Artist(3, "Imagine Dragons", "Indie", 1, Arrays.asList(2, 3, 2)));
        artists.add(new Artist(4, "Arctic Monkeys", "Rock", 1, Arrays.asList(4, 4, 4)));
        artists.add(new Artist(5, "Linkin Park", "Rock", 2, Arrays.asList(3, 4, 3)));


        artists.removeIf(a -> a.getAverageRating() < 3.0);

        for (Artist a : artists) {
            if (a.getAverageRating() >= 4.0) {
                a.setRank(a.getRank() + 1);
            }
        }

        System.out.println("Артисты с рангом 2");
        printArtists(artists, 2);

        artists.sort(
                Comparator.comparingDouble(Artist::getAverageRating)
                        .thenComparing(Artist::getName).reversed()
        );
        System.out.println("\nОтсортированный список");
        for (Artist a : artists) {
            System.out.println(a.getId() + " " + a.getName() + " " + a.getAverageRating());
        }
    }
}