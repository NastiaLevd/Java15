package org.example;
import java.util.LinkedHashMap;
import java.util.Map;
public class Main {
    public static void main(String[] args) {
             Map<String, Film> films = new LinkedHashMap<>();

        Film[] movieList = {
                new Action("Безумный Макс: Дорога ярости", 101, 120, 150),
                new Action("Крепкий орешек", 102, 132, 45),
                new Action("Джон Уик", 103, 101, 30),

                new Comedy("Один дома", 201, 103, 9.1),
                new Comedy("Маска", 202, 101, 8.8),
                new Comedy("Мальчишник в Вегасе", 203, 100, 8.5),

                new Drama("Форрест Гамп", 301, 142, 6),
                new Drama("Оппенгеймер", 302, 180, 7)
        };

        for (Film film : movieList) {
            films.put(film.getTitle(), film);
        }

        for (Map.Entry<String, Film> entry : films.entrySet()) {
            System.out.println("Ключ: \"" + entry.getKey() + "\" | Значение: " + entry.getValue());
        }
}}
