package buildings;

public class OfficeBuilding implements Buildable, Habitable {
    private String address;
    private int floors;
    private int companies;
    private boolean built;
    private int workers;

    public OfficeBuilding(String address, int floors, int companies) {
        this.address = address;
        this.floors = floors;
        this.companies = companies;
        this.built = false;
        this.workers = 0;
    }

    @Override
    public void build() {
        built = false;
        System.out.println("Офисное здание по адресу " + address + " построено (" + floors + " этажей, " + companies + " компаний).");
    }

    @Override
    public int getFloors() {
        return floors;
    }

    @Override
    public void live() {
        if (!built) {
            System.out.println("Здание " + address + " ещё не построено — заселение невозможно.");
            return;
        }
        workers = companies * 20;
        System.out.println("В офисное здание " + address + " заселено " + workers + " сотрудников.");
    }

    @Override
    public int getCapacity() {
        return companies * 20;
    }

    public String getAddress() { return address; }
    public int getCompanies() { return companies; }
    public int getWorkers() { return workers; }
}