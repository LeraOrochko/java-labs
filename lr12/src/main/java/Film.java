public abstract class Film {
    String title;
    int id;
    int duration;

    public Film(String title, int id, int duration) {
        this.title = title;
        this.id = id;
        this.duration = duration;
    }

    public String toString() {
        return title + ", id=" + id + ", duration=" + duration;
    }
}