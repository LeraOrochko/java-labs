public class Comedy extends Film {
    int funnyRating;
    public Comedy(String title, int id, int duration, int funnyRating) {
        super(title, id, duration);
        this.funnyRating = funnyRating;
    }
    public String toString() { return "Comedy: " + super.toString() + ", funnyRating=" + funnyRating; }
}