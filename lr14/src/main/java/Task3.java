import java.io.*;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        File f = new File("f.txt");
        File g = new File("g.txt");
        File h = new File("h.txt");
        Random rnd = new Random();

        try (FileOutputStream fos = new FileOutputStream(f)) {
            for (int i = 0; i < 20; i++) {
                fos.write((rnd.nextInt(201) - 100 + "\n").getBytes());
            }
        } catch (IOException e) {
            System.err.println("Ошибка записи f: " + e.getMessage());
        }

        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(f)));
             FileOutputStream fosG = new FileOutputStream(g);
             FileOutputStream fosH = new FileOutputStream(h)) {

            String line;
            while ((line = br.readLine()) != null) {
                int num = Integer.parseInt(line.trim());
                if (num % 10 == 0) {
                    fosG.write((num + "\n").getBytes());
                } else {
                    fosH.write((num + "\n").getBytes());
                }
            }
        } catch (IOException e) {
            System.err.println("Ошибка обработки: " + e.getMessage());
        }

        System.out.println("Готово. Файлы g.txt и h.txt созданы.");
    }
}