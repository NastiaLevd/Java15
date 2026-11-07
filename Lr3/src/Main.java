import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("\nВведите номер задания: ");
            int u = scanner.nextInt();

            switch (u) {
                case 0: {
                    System.out.println("Выход из программы...");
                    scanner.close();
                    return;
                }

                case 1: {
                    Random rand = new Random();

                    System.out.print("Введите размер массива: ");
                    int n = scanner.nextInt();

                    int[] arr = new int[n];
                    for (int i = 0; i < arr.length; i++) {
                        arr[i] = rand.nextInt(50) +1;
                    }
                    System.out.println("Сгенерированный массив: " + Arrays.toString(arr));

                    int sum = 0;
                    for (int i = 0; i < arr.length; i += 2) {
                        sum += arr[i];
                    }
                    System.out.println("Сумма элементов на чётных позициях: " + sum);
                } break;

                case 2: {
                    int[][] matrix = {
                            {2, 4, -9},
                            {88, 3, -2},
                            {12, 12, 9}
                    };

                    System.out.println("Исходная матрица:");
                    for (int[] row : matrix) {
                        System.out.println(Arrays.toString(row));
                    }

                    for (int i = 0; i < matrix.length; i++) {
                        matrix[i][i] = matrix[i][i] * matrix[i][i];
                    }

                    System.out.println("Матрица после возведения элементов главной диагонали в квадрат:");
                    for (int[] row : matrix) {
                        System.out.println(Arrays.toString(row));
                    }
                } break;

                default:
                    System.out.println("Неверный номер задания! Попробуйте снова.");
                    break;
            }
        }
    }
}