public class Report {

    public static void generateReport(Employee[] employees){

        System.out.printf("%-15s | %15s%n", "Фамилия", "Зарплата");
        System.out.println("-".repeat(35));
        for(Employee employee : employees){
            System.out.printf(("%-15s | %15.2f%n"), employee.getFullname(), employee.getSalary());

        }

    }
}
