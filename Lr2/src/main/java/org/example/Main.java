package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1 - Задание 1");
            System.out.println("2 - Задание 2");
            System.out.println("0 - Выход");
            System.out.print("Выберите задание: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1: {
                    int[] a = {3, 5, 7, 2, 8, 4};
                    int sum = 0;

                    System.out.println("Массив:");
                    for (int i = 0; i < a.length; i++) {
                        System.out.print(a[i] + " ");
                    }

                    for (int i = 0; i < a.length; i += 2) {
                        sum += a[i];
                    }

                    System.out.println("\nСумма элементов на четных индексах: " + sum);
                    break;
                }

                case 2: {
                    int[][] a = {
                            {1, 2, 3},
                            {4, 5, 6},
                            {7, 8, 9}
                    };

                    for (int i = 0; i < a.length; i++) {
                        a[i][i] = a[i][i] * a[i][i];
                    }

                    System.out.println("Матрица после изменения:");
                    for (int i = 0; i < a.length; i++) {
                        for (int j = 0; j < a[i].length; j++) {
                            System.out.print(a[i][j] + " ");
                        }
                        System.out.println();
                    }
                    break;
                }

                case 0:
                    return;

                default:
                    System.out.println("Нет такого задания");
            }
        }
    }
}
