package by.epam.learn.food;

public abstract class Food {
    private String name;
    private int calories;
    private int cookingTime;

    public Food(String name, int calories, int cookingTime) {
        this.name = name;
        this.calories = calories;
        this.cookingTime = cookingTime;
    }

    public void cook() {
        System.out.println("Готовится...");
    }

    public void displayInfo() {
        System.out.println("Блюдо: " + name + ", калорийность: " + calories
                + ", время готовки: " + cookingTime + " мин");
    }

    public abstract void addExtra();
}