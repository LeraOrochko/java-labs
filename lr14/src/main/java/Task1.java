import java.io.*;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("game.txt");

        try (FileWriter fw = new FileWriter(file)) {
            fw.write("Моя любимая игра: Outlast\n");
            fw.write("Жанр: survival horror\n");
            fw.write("Разработчик: Red Barrels\n");
            fw.write("Год выпуска: 2013\n");
            fw.write("Платформа: PC, PlayStation 4, Xbox One\n");
        } catch (IOException e) {
            System.err.println("Ошибка записи: " + e.getMessage());
        }

        System.out.println(" Данные о файле ");
        System.out.println("Имя файла: " + file.getName());
        System.out.println("Размер: " + file.length() + " байт");
        System.out.println("Последняя модификация: " + file.lastModified());
        System.out.println("Путь: " + file.getPath());
        System.out.println("Абсолютный путь: " + file.getAbsolutePath());
        System.out.println("Файл " + (file.exists() ? "существует" : "не существует"));
        System.out.println(file.canRead() ? "Чтение разрешено" : "Чтение запрещено");
        System.out.println(file.canWrite() ? "Запись разрешена" : "Запись запрещена");
        System.out.println("Это " + (file.isDirectory() ? "каталог" : "не каталог"));
        System.out.println("Это " + (file.isFile() ? "обычный файл" : "не обычный файл"));

        System.out.println("\nСодержимое файла ");
        try (FileReader fr = new FileReader(file)) {
            int c;
            while ((c = fr.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException e) {
            System.err.println("Ошибка чтения: " + e.getMessage());
        }
    }
}