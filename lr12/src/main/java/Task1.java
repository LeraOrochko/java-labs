import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        Map<String, Film> map = new LinkedHashMap<>();

        map.put("Die Hard",   new Action("Die Hard", 1, 132, 15));
        map.put("Mad Max",    new Action("Mad Max", 2, 120, 20));
        map.put("John Wick",  new Action("John Wick", 3, 101, 12));

        map.put("Hangover",   new Comedy("Hangover", 4, 100, 8));
        map.put("Superbad",   new Comedy("Superbad", 5, 113, 7));
        map.put("Borat",      new Comedy("Borat", 6, 84, 9));

        map.put("Titanic",    new Drama("Titanic", 7, 195, 11));
        map.put("Forrest Gump", new Drama("Forrest Gump", 8, 142, 6));

        Iterator<Map.Entry<String, Film>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, Film> e = it.next();
            System.out.println("Ключ: " + e.getKey() + " -> " + e.getValue());
        }
    }
}