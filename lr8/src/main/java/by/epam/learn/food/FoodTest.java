package by.epam.learn.food;

public class FoodTest {
    public static void main(String[] args) {
        Food[] foods = new Food[5];

        foods[0] = new Pizza("Маргарита", 250, 20, "сыр, томаты");
        foods[1] = new Pizza("Пепперони", 300, 25, "сыр, колбаса");
        foods[2] = new Pizza("Гавайская", 280, 22, "сыр, курица, ананас");
        foods[3] = new Salad("Цезарь", 180, 10, "майонез");
        foods[4] = new Salad("Греческий", 120, 8, "оливковое масло");

        System.out.println("FOOOOOOOOD1");
Food food1 = new Pizza("Маргарита", 250, 20, "сыр, томаты");
food1.displayInfo();

Food food2 = new Food("Бургер", 1000, 25);

Pizza pizza = new Pizza("Маргарита", 250, 20, "сыр, томаты");
        System.out.println("PIZZZAAAAA");
pizza.displayInfo();
        for (Food food : foods) {
            food.displayInfo();
            food.cook();
            System.out.println();
        }

        System.out.println("Демонстрация уникальных методов");

        for (Food food : foods) {
            food.addExtra();
        }

        System.out.println();
        System.out.println("Информация после изменения");

        for (Food food : foods) {
            food.displayInfo();
            System.out.println();
        }
    }
}