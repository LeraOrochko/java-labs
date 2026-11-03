package buildings;

public class Main {
    public static void main(String[] args) {
        ResidentialBuilding r1 = new ResidentialBuilding("ул. Ленина, 10", 9, 72);
        ResidentialBuilding r2 = new ResidentialBuilding("пр. Мира, 25", 5, 40);
        ResidentialBuilding r3 = new ResidentialBuilding("ул. Садовая, 7", 12, 96);
        OfficeBuilding o1 = new OfficeBuilding("ул. Деловая, 1", 20, 15);
        OfficeBuilding o2 = new OfficeBuilding("пр. Бизнес, 3", 8, 6);

        Buildable[] buildables = new Buildable[] { r1, r2, r3, o1, o2 };
        Habitable[] habitables = new Habitable[] { r1, r2, r3, o1, o2 };

        for (int i = 0; i < buildables.length; i++) {
            System.out.println("Здание " + (i + 1));
            buildables[i].build();
            habitables[i].live();
            System.out.println("Вместимость: " + habitables[i].getCapacity());
        }
    }
}