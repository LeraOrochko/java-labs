import java.io.*;

public class Task5 {
    public static void main(String[] args) {
        File f = new File("f5.txt");

        int[] nums = {5, -15, -3, -20, 0, 7, -11, 12, -25, 8};
        try (FileOutputStream fos = new FileOutputStream(f)) {
            for (int n : nums) {
                fos.write((n + "\n").getBytes());
            }
        } catch (IOException e) {
            System.err.println("Ошибка записи: " + e.getMessage());
        }

        int count = 0;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(f)))) {
            String line;
            while ((line = br.readLine()) != null) {
                int num = Integer.parseInt(line.trim());
                if (num < -10) {
                    count++;
                }
            }
        } catch (IOException e) {
            System.err.println("Ошибка чтения: " + e.getMessage());
        }
        System.out.println("Количество чисел, меньших -10: " + count);
    }
}