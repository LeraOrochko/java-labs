import java.util.*;

public class Artist {
    int id;
    String name;
    String genre;
    int rank;
    List<Integer> fanRatings;

    public Artist(int id, String name, String genre, int rank, List<Integer> fanRatings) {
        this.id = id;
        this.name = name;
        this.genre = genre;
        this.rank = rank;
        this.fanRatings = fanRatings;
    }

    public double getAverageRating() {
        int sum = 0;
        for (int r : fanRatings) sum += r;
        return (double) sum / fanRatings.size();
    }

    public int getRank() { return rank; }
    public void setRank(int rank) { this.rank = rank; }

    public String toString() {
        return "id=" + id + ", " + name + ", жанр=" + genre +
                ", ранг=" + rank +
                ", средний=" + String.format("%.2f", getAverageRating());
    }
}