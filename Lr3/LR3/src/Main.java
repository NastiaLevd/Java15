import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Main {
    public static boolean isValid(String phone) {
        if (phone == null || phone.isEmpty()) {
            return false;
        }
        return phone.matches("^\\+375\\d{9}$");
    }
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
                    String str = "Привет, мир!";
                    if(str.startsWith("Привет")){
                        System.out.println("Строка начинается с 'Привет'");
                    }
                    else{
                        System.out.println("Строка не начинается");
                    }
                }break;
                case 2: {
                    System.out.println(isValid("+375291234567"));
                    System.out.println(isValid("+375331234567"));
                    System.out.println(isValid("375291234567"));
                    System.out.println(isValid("+37529123456"));
                    System.out.println(isValid("+3752912345678"));
                    System.out.println(isValid("+375 (29) 123-45-67"));
                }break;
                case 3: {
                    Employee[] employees ={
                            new Employee("Левданская А.П.", 1500.5),
                            new Employee("Смирнова О.Н.", 2750.4),
                            new Employee("Петров П.П.", 2300.75),
                            new Employee("Сидоров С.С.", 980.0),
                            new Employee("Кузнецов А.В.", 3100.99)
                    };
                    Report.generateReport(employees);
                }break;
                case 4: {
                    String str = "aba abba abbba abbbba";

                    Pattern pattern = Pattern.compile("ab{3}a");
                    Matcher matcher = pattern.matcher(str);

                    System.out.println("Найденные совпадения:");
                    while (matcher.find()) {
                        System.out.println(matcher.group());
                    }}break;
                default:break;
            }
        }
    }
}