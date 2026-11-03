package buildings;

public class ResidentialBuilding implements Buildable, Habitable {
    private String address;
    private int floors;
    private int apartments;
    private boolean built;
    private int residents;

    public ResidentialBuilding(String address, int floors, int apartments) {
        this.address = address;
        this.floors = floors;
        this.apartments = apartments;
        this.built = false;
        this.residents = 0;
    }

    @Override
    public void build() {
        built = true;
        System.out.println("Жилой дом по адресу " + address + " построен (" + floors + " этажей, " + apartments + " квартир).");
    }

    @Override
    public int getFloors() {
        return floors;
    }

    @Override
    public void live() {
        if (!built) {
            System.out.println("Дом " + address + " ещё не построен — заселение невозможно.");
            return;
        }
        residents = apartments * 3;
        System.out.println("В жилой дом " + address + " заселено " + residents + " жителей.");
    }

    @Override
    public int getCapacity() {
        return apartments * 3;
    }

    public String getAddress() { return address; }
    public int getApartments() { return apartments; }
    public int getResidents() { return residents; }
}