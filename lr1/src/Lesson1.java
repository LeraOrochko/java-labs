import java.util.Scanner;

public class Lesson1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите номер задания (1-4): ");
        int task = in.nextInt();

        switch (task) {
            case 1:
                System.out.print("Введите число 1: ");
                int a = in.nextInt();
                System.out.print("Введите число 2: ");
                int b = in.nextInt();
                System.out.print("Введите число 3: ");
                int c = in.nextInt();
                System.out.print("Введите число 4: ");
                int d = in.nextInt();
                System.out.print("Введите число 5: ");
                int e = in.nextInt();

                float average = (float) (a + b + c + d + e) / 5;
                System.out.println("Среднее арифметическое: " + average);
                break;

            case 2:
                System.out.print("Введите сумму покупки: ");
                double purchase = in.nextDouble();

                double discount;
                if (purchase > 1000) {
                    discount = 0.10; // 10%
                } else {
                    discount = 0.05; // 5%
                }

                double discount_result = purchase * discount;
                double finalresult = purchase - discount_result;

                System.out.println("Сумма покупки: " + purchase);
                System.out.println("Скидка: " + (discount * 100) + "%");
                System.out.println("Сумма скидки: " + discount);
                System.out.println("Итоговая сумма к оплате: " + finalresult);
                break;

            case 3:
                for (int i = 1; i <= 5; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;

            case 4:
                System.out.print("Введите столицу");
                String city = in.next();
                switch(city){
                    case "минск":
                        System.out.println("беларусь");
                        break;

            case "варшава":
                System.out.println("польша");
                break;
        }
break;
            default:
                System.out.println("Нет номера задания. Введите 1, 2 или .");
                break;
        }

        in.close();
    }
}