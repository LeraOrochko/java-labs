import java.io.*;

public class Task4 {
    public static void main(String[] args) {
        File f = new File("time.txt");

        try (BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
             FileOutputStream fos = new FileOutputStream(f)) {
            System.out.println("Введите 15 значений времени (в секундах):");
            for (int i = 0; i < 15; i++) {
                System.out.print("Значение " + (i + 1) + ": ");
                double v = Double.parseDouble(console.readLine().trim().replace(',', '.'));
                fos.write((v + "\n").getBytes());
            }
        } catch (IOException e) {
            System.err.println("Ошибка ввода/вывода: " + e.getMessage());
        }

        double sum = 0;
        int count = 0;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(f)))) {
            String line;
            while ((line = br.readLine()) != null) {
                sum += Double.parseDouble(line.trim());
                count++;
            }
        } catch (IOException e) {
            System.err.println("Ошибка чтения: " + e.getMessage());
        }
        if (count > 0) {
            System.out.println("Среднее время: " + (sum / count) + " с");
        }
    }
}