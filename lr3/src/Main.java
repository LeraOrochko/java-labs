import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.print("Ваш выбор: ");
        number = scanner.nextInt();
        scanner.nextLine();

        switch (number) {
            case 1:
                System.out.print("Введите строку: ");
                String str = scanner.nextLine();

                boolean starts = str.startsWith("Привет");
                System.out.println("Строка начинается с \"Привет\": " + starts);
                break;

            case 2:
                System.out.print("Введите номер телефона: ");
                String phone = scanner.nextLine();

                boolean isCorrect = Pattern.matches("\\+?\\d{12}", phone);
                System.out.println("Номер телефона: " + phone);
                System.out.println("Корректный номер: " + isCorrect);
                break;

            case 3:
                Employee[] employees = {
                        new Employee("Иванов", 1234.5),
                        new Employee("АрАчко", 9876.543),
                        new Employee("ПавлОвец", 555.0),
                        new Employee("СигаЕва", 10000.999)
                };

                Report.generateReport(employees);
                break;

            case 4:
                String text = "aba abba abbba abbbba";
                Pattern pattern = Pattern.compile("ab{2,3}a");
                Matcher matcher = pattern.matcher(text);
                while (matcher.find()) {
                    System.out.println(matcher.group());
                }
                break;

            default:
                System.out.println("Выберите номер задания 1, 2, 3 или 4");
        }

        scanner.close();
    }
}

class Employee {
    String fullname;
    double salary;

    Employee(String fullname, double salary) {
        this.fullname = fullname;
        this.salary = salary;
    }
}

class Report {
    static void generateReport(Employee[] employees) {
        System.out.printf("%-15s | %15s%n", "Фамилия", "Зарплата");

        for (int i = 0; i < employees.length; i++) {
            System.out.printf("%-15s |%15.2f%n", employees[i].fullname, employees[i].salary);
        }
    }
}