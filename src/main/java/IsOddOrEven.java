import java.util.Scanner;

public class IsOddOrEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Введите число: ");

            // Проверяем, является ли ввод числом
            if (scanner.hasNextInt()) {
                int n = scanner.nextInt();

                // Проверяем четность
                if (n % 2 == 0) {
                    System.out.println("Число " + n + " — четное.");
                } else {
                    System.out.println("Число " + n + " — нечетное.");
                }

                break; // Выходим из цикла после успешного выполнения
            } else {
                System.out.println("Ошибка: введите целое число!");
                scanner.next(); // Очищаем некорректный ввод
            }
        }

        scanner.close();
    }
}