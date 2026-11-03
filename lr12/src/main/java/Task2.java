import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        List<Artist> list = new ArrayList<>();
        list.add(new Artist(1, "Ivanov",   "Rock",    2, Arrays.asList(5, 4, 5)));
        list.add(new Artist(2, "Petrov",   "Pop",     3, Arrays.asList(2, 2, 3)));
        list.add(new Artist(3, "Sidorov",  "Jazz",    1, Arrays.asList(4, 4, 4)));
        list.add(new Artist(3, "Idorov",  "Jazz",    1, Arrays.asList(4, 4, 4)));
        list.add(new Artist(4, "Smirnov",  "Rock",    4, Arrays.asList(3, 3, 2)));
        list.add(new Artist(5, "Kuznetsov","Classic", 2, Arrays.asList(1, 2, 2)));
        list.add(new Artist(6, "Popov",    "Pop",     3, Arrays.asList(5, 5, 4)));

        System.out.println(" Исходный список ");
        printAll(list);

        Iterator<Artist> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().getAverageRating() < 3) {
                it.remove();
            }
        }
        System.out.println("\n После удаления средний < 3 ");
        printAll(list);

        Iterator<Artist> it2 = list.iterator();
        while (it2.hasNext()) {
            Artist a = it2.next();
            if (a.getAverageRating() >= 4) {
                a.setRank(a.getRank() + 1);
            }
        }
        System.out.println("\n После повышения ранга (средний >= 4) ");
        printAll(list);

        System.out.println("\n Артисты с рангом 3 ");
        printArtists(list, 3);

        list.sort(
                Comparator.comparingDouble(Artist::getAverageRating).reversed().thenComparing(a -> a.name).reversed()
        );

        System.out.println("\nОтсортировано: ID, имя, средний рейтинг ");
        Iterator<Artist> it3 = list.iterator();
        while (it3.hasNext()) {
            Artist a = it3.next();
            System.out.printf("ID=%d, имя=%s, средний=%.2f%n",
                    a.id, a.name, a.getAverageRating());
        }
    }

    static void printAll(List<Artist> list) {
        Iterator<Artist> it = list.iterator();
        while (it.hasNext()) System.out.println(it.next());
    }

    static void printArtists(List<Artist> list, int rank) {
        Iterator<Artist> it = list.iterator();
        while (it.hasNext()) {
            Artist a = it.next();
            if (a.getRank() == rank) System.out.println(a);
        }
    }
}