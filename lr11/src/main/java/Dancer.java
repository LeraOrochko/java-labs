public class Dancer extends Actor {
    private String style;

    public Dancer(String name, int age, String genre, String style) {
        super(name, age, genre);
        this.style = style;
    }

    @Override
    public String getAwards() {
        return "3 награды";
    }

    public void perform(String dance, double duration) {
        System.out.println(name + ": Танцует \"" + dance + "\" длительностью " + duration + " мин");
    }

    public String getStyle() { return style; }
}