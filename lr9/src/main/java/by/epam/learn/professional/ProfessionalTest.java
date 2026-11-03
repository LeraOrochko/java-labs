package by.epam.learn.professional;

public class ProfessionalTest {
    public static void main(String[] args) {
        Professional[] professionals = new Professional[5];

        professionals[0] = new Doctor("Иванов И.И.", 10, 4.8, "Терапевт");
        professionals[1] = new Doctor("Петрова А.С.", 7, 4.6, "Хирург");
        professionals[2] = new Doctor("Сидоров В.П.", 15, 4.9, "Кардиолог");
        professionals[3] = new Engineer("Кузнецов Д.А.", 6, 4.4, "Система отопления");
        professionals[4] = new Engineer("Морозова Е.В.", 9, 4.7, "Мост через реку");

        System.out.println("Демонстрация полиморфизма");

        for (Professional p : professionals) {
            p.displayInfo();
            p.work();
            System.out.println("Обязанности: " + p.getResponsibilities());
            System.out.println();
        }

        System.out.println("Демонстрация уникальных полей");

        for (Professional p : professionals) {
            System.out.println(p.getUniqueInfo());
        }
    }
}