public class Athlete {
    private String name;
    private String sport;
    private int medals;

    private static int totalAthletes = 0;
    private static int totalMedals = 0;

    public Athlete(String name, String sport, int medals) {
        this.name = name;
        this.sport = sport;
        this.medals = medals;
        totalAthletes++;
        totalMedals += medals;
    }

    public static int getTotalAthletes() { return totalAthletes; }
    public static int getTotalMedals()   { return totalMedals; }

    public static double getAverageMedals() {
        if (totalAthletes == 0) {
            return 0;
        }
        return (double) totalMedals / totalAthletes;
    }
    public String getName()  { return name; }
    public String getSport() { return sport; }
    public int getMedals()   { return medals; }

    public static void main(String[] args) {
        Athlete a1 = new Athlete("Иван Петров", "Плавание", 7);
        Athlete a2 = new Athlete("Мария Сидорова", "Гимнастика", 12);
        Athlete a3 = new Athlete("Алексей Смирнов", "Бокс", 5);
        Athlete a4 = new Athlete("Ольга Кузнецова", "Лёгкая атлетика", 9);
        Athlete a5 = new Athlete("Дмитрий Волков", "Дзюдо", 4);

        System.out.println("Всего спортсменов: " + Athlete.getTotalAthletes());
        System.out.println("Всего медалей: "    + Athlete.getTotalMedals());
        System.out.printf("Среднее число медалей: %.2f\n", Athlete.getAverageMedals());
    }
}