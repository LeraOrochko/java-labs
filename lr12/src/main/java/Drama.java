public class Drama extends Film {
    int oscars;
    public Drama(String title, int id, int duration, int oscars) {
        super(title, id, duration);
        this.oscars = oscars;
    }
    public String toString() { return "Drama: " + super.toString() + ", oscars=" + oscars; }
}