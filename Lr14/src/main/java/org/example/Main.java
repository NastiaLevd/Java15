package org.example;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.println("\nЛюбимая игра");
            File game = new File("game.txt");

            try (FileWriter writer = new FileWriter(game)) {
                writer.write("Название: Minecraft\n");
                writer.write("Жанр: песочница\n");
                writer.write("Описание: можно строить и исследовать мир.\n");
            }

            System.out.println("Имя файла: " + game.getName());
            System.out.println("Размер: " + game.length() + " байт");
            System.out.println("Путь: " + game.getAbsolutePath());
            System.out.println("Содержимое:");

            try (BufferedReader reader = new BufferedReader(new FileReader(game))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
            }

            System.out.println("\n Сумма отрицательных чисел");
            new File("task2").mkdirs();
            File f2 = new File("task2/f.txt");

            try (PrintWriter writer = new PrintWriter(new FileWriter(f2))) {
                for (int i = 1; i <= 10; i++) {
                    System.out.print("Введите число " + i + ": ");
                    int number = input.nextInt();
                    writer.println(number);
                }
            }

            int sum = 0;
            System.out.println("Числа из файла:");

            try (Scanner reader = new Scanner(f2)) {
                while (reader.hasNextInt()) {
                    int number = reader.nextInt();
                    System.out.print(number + " ");

                    if (number < 0) {
                        sum += number;
                    }
                }
            }
            System.out.println("\nСумма отрицательных: " + sum);


            System.out.println("\nЧисла, кратные 10");
            new File("task3").mkdirs();

            File f3 = new File("task3/f.txt");
            File g3 = new File("task3/g.txt");
            File h3 = new File("task3/h.txt");

            Random random = new Random();

            try (PrintWriter writer = new PrintWriter(new FileWriter(f3))) {
                for (int i = 0; i < 20; i++) {
                    writer.println(random.nextInt(101));
                }
            }

            System.out.println("Случайные числа:");

            try (Scanner reader = new Scanner(f3);
                 PrintWriter writerG = new PrintWriter(new FileWriter(g3));
                 PrintWriter writerH = new PrintWriter(new FileWriter(h3))) {

                while (reader.hasNextInt()) {
                    int number = reader.nextInt();
                    System.out.print(number + " ");

                    if (number % 10 == 0) {
                        writerG.println(number);
                    } else {
                        writerH.println(number);
                    }
                }
            }

            System.out.println("\nКратные 10 — в task3/g.txt, остальные — в task3/h.txt");


            System.out.println("\n Среднее время");
            File timeFile = new File("time.txt");

            try (PrintWriter writer = new PrintWriter(new FileWriter(timeFile))) {
                for (int i = 1; i <= 15; i++) {
                    System.out.print("Введите время " + i + " (сек): ");
                    double time = Double.parseDouble(input.next().replace(',', '.'));
                    writer.println(time);
                }
            }

            double totalTime = 0;
            int countTime = 0;

            System.out.println("Время из файла:");

            try (Scanner reader = new Scanner(timeFile)) {
                reader.useLocale(Locale.US);

                while (reader.hasNextDouble()) {
                    double time = reader.nextDouble();
                    System.out.print(time + " ");
                    totalTime += time;
                    countTime++;
                }
            }

            System.out.println("\nСреднее время: " + (totalTime / countTime) + " сек");


            System.out.println("\nКоличество чисел меньше -10");
            new File("task5").mkdirs();

            File f5 = new File("task5/f.txt");
            int[] numbers = {-20, -11, -10, -5, 0, 3, 14, -30, 7, -8};

            try (PrintWriter writer = new PrintWriter(new FileWriter(f5))) {
                for (int number : numbers) {
                    writer.println(number);
                }
            }

            int count = 0;
            System.out.println("Числа из файла:");

            try (Scanner reader = new Scanner(f5)) {
                while (reader.hasNextInt()) {
                    int number = reader.nextInt();
                    System.out.print(number + " ");

                    if (number < -10) {
                        count++;
                    }
                }
            }

            System.out.println("\nКоличество чисел меньше -10: " + count);

        } catch (IOException e) {
            System.out.println("Ошибка работы с файлом: " + e.getMessage());
        }
    }
}

