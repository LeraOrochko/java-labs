import java.util.Scanner;

void main() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Выберите задание:");
    System.out.println("1 - Сумма элементов на чётных позициях");
    System.out.println("2 - Квадраты элементов главной диагонали");
    int choice = scanner.nextInt();

    switch (choice) {
        case 1: {
            System.out.print("Введите количество элементов: ");
            int n = scanner.nextInt();
            int[] nums;
            nums = new int[n];
            System.out.println("Введите элементы массива:");
            for (int i = 0; i < nums.length; i++) {
                nums[i] = scanner.nextInt();
            }
            int sum = 0;
            for (int i = 0; i < nums.length; i += 2) {
                sum += nums[i];
            }
            System.out.println("Сумма элементов на чётных позициях: " + sum);
            break;
        }

        case 2: {
            System.out.print("Введите размер матрицы N: ");
            int n = scanner.nextInt();
            int[][] matrix = new int[n][n];
            System.out.println("Введите элементы матрицы:");
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix.length; j++) {
                    matrix[i][j] = scanner.nextInt();
                }
            }
            for (int i = 0; i < n; i++) {
                matrix[i][i] *= matrix[i][i];
            }
            System.out.println("Матрица после возведения диагонали в квадрат:");
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix.length; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();]
            }
            break;
        }
        default:
            System.out.println("Неверный выбор. Введите 1 или 2.");
    }
}

