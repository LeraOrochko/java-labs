import java.io.*;

public class Task2 {
    public static void main(String[] args) {
        File f = new File("f.txt");

        try (BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
             FileOutputStream fos = new FileOutputStream(f)) {
            System.out.println("Введите 10 целых чисел:");
            for (int i = 0; i < 10; i++) {
                System.out.print("Число " + (i + 1) + ": ");
                int num = Integer.parseInt(console.readLine().trim());
                fos.write((num + "\n").getBytes());
            }
        } catch (IOException e) {
            System.err.println("Ошибка ввода/вывода: " + e.getMessage());
        }

        int sumNegative = 0;
        System.out.println("\nЧисла из файла");
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(f)))) {
            String line;
            while ((line = br.readLine()) != null) {
                int num = Integer.parseInt(line.trim());
                System.out.println(num);
                if (num < 0) {
                    sumNegative += num;
                }
            }
        } catch (IOException e) {
            System.err.println("Ошибка чтения: " + e.getMessage());
        }
        System.out.println("Сумма отрицательных чисел: " + sumNegative);
    }
}