package by.epam.learn.professional;

public class Doctor extends Professional {
    private String specialization;

    public Doctor(String name, int experience, double rating, String specialization) {
        super(name, experience, rating);
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    @Override
    public void work() {
        System.out.println("Лечит пациентов");
    }

    @Override
    public String getResponsibilities() {
        return "Диагностика и лечение";
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Специализация: " + specialization);
    }

    @Override
    public String getUniqueInfo() {
        return getName() + " — специализация: " + specialization;
    }
}