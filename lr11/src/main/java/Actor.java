public class Actor {
    protected String name;
    protected int age;
    protected String genre;

    public Actor(String name, int age, String genre) {
        this.name = name;
        this.age = age;
        this.genre = genre;
    }

    public void perform() {
        System.out.println(name + ": Выступает");
    }

    public void perform(String role) {
        System.out.println(name + ": Играет роль " + role);
    }
    public void perform(int age){System.out.println(name + ": Возраст " + age);}
    public void perform(float scenes) {
        System.out.println(name + ": Играет в " + scenes + " сценах");
    }
//перегруженный критерии выполняться
    //переопределенный динам полиморфизм метод оверайд есть родительский переопределение в наслед классе
    public String getAwards() {
        return "Нет наград";
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public String getGenre() { return genre; }
}