public class Main {
    public static void main(String[] args) {
        System.out.println("Перегрузка (статический полиморфизм)");
        Actor a = new Actor("Иван Петров", 40, "Драма");
        a.perform();
        a.perform("Гамлет");
        a.perform(7);

        System.out.println();
        System.out.println("Собственная перегрузка Singer");
        Singer s = new Singer("Анна Смирнова", 28, "Поп", 3);
        s.perform();
        s.perform("Соловей");
        s.perform(5);
        s.perform("Соловей", 2);

        Dancer d = new Dancer("Олег Кузнецов", 25, "Балет", "Классика");
        d.perform();
        d.perform("Лебединое озеро");
        d.perform(4);
        d.perform("Вальс", 3.5);

        System.out.println();
        System.out.println("Переопределение (динамический полиморфизм)");
        Actor[] actors = new Actor[] { a, s, d };
        for (int i = 0; i < actors.length; i++) {
            System.out.println(actors[i].getName() + " — награды: " + actors[i].getAwards());
        }

        System.out.println();
        System.out.println("Статический vs динамический полиморфизм");
        Actor poly = new Singer("Мария Иванова", 30, "Джаз", 5);
        poly.perform();
        poly.perform(10);
        System.out.println("Награды (динамически): " + poly.getAwards());
    }
}