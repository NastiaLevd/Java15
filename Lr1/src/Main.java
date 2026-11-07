import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("\nВведите номер задания: ");
            int u = scanner.nextInt();

            switch (u) {
                case 0: {
                    System.out.println("Программа завершена.");
                    return;
                }

                case 1: {
                    int sum = 0;

                    for (int i = 0; i < 5; i++) {
                        System.out.print("Введите число " + (i + 1) + ": ");
                        int a = scanner.nextInt();
                        sum += a;
                    }

                    double avg = sum / 5.0;
                    System.out.println("Среднее арифметическое пяти введённых чисел: " + avg);
                }
                break;

                case 2: {
                    System.out.print("Введите сумму покупки: ");
                    double s = scanner.nextDouble();

                    if (s > 1000) {
                        s -= s * 0.10;
                        System.out.println("Ваша скидка составляет 10%");
                        System.out.println("Итоговая сумма: " + s);
                    } else {
                        s -= s * 0.05;
                        System.out.println("Ваша скидка составляет 5%");
                        System.out.println("Итоговая сумма: " + s);
                    }
                }
                break;

                case 3: {
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }

                        System.out.println();
                    }
                }
                break;
                case 4:{
                    System.out.print("Введите страну ");
                    String country = scanner.next();
                    switch(country){
                        case "Germany":
                            System.out.print("Столица - Berlin");
                            break;
                        case "Belarus":
                            System.out.print(" Столица - Minsk");
                            break;
                        case "Russia":
                            System.out.print(" Столица -Moscow");
                            break;


                            default: break;

                    }}break;
                default: {
                    System.out.println("Такого задания нет.");
                }
                break;
            }
        }

    }
  // scanner.close();
}