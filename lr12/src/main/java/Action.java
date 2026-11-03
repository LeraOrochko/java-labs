public class Action extends Film {
    int explosions;
    public Action(String title, int id, int duration, int explosions) {
        super(title, id, duration);
        this.explosions = explosions;
    }
    public String toString() { return "Action: " + super.toString() + ", explosions=" + explosions; }
}