package by.epam.learn.food;

public class Salad extends Food {
    private String dressing;

    public Salad(String name, int calories, int cookingTime, String dressing) {
        super(name, calories, cookingTime);
        this.dressing = dressing;
    }

    public String getDressing() {
        return dressing;
    }

    public void setDressing(String dressing) {
        this.dressing = dressing;
    }

    @Override
    public void cook() {
        System.out.println("Нарезается и смешивается");
    }

    public void addDressing(String newDressing) {
        dressing = newDressing;
        System.out.println("Добавлена заправка: " + newDressing);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Заправка: " + dressing);
    }

    @Override
    public void addExtra() {
        addDressing("сметана");
    }
}