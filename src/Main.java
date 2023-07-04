import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        // 1.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        double number = 0;
        try {
            number = scanner.nextDouble();
            double squareNumber = Math.sqrt(number);
            System.out.println("Квадратное число: " + squareNumber);
        } catch (Exception e) {
            System.out.println("Возникла ошибка");
        }

        // 2.

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите возможного количество баллов за задание: ");
        int x = scanner1.nextInt();
        System.out.println("Введите количество выполненных заданий");
        int y = scanner1.nextInt();

        try {
            int result = divide(x,y);
            System.out.println("Результат: " + result);
        } catch (Exception e) {
            System.out.println("Возникла ошибка");
        }
        
        // 3.
        try {
            Scanner scanner2 = new Scanner(System.in);
            System.out.println("Введите первое число: ");
            int firstNum = scanner2.nextInt();
            System.out.println("Введите второе число: ");
            int secondNum = scanner2.nextInt();
            System.out.println("Введите третье число: ");
            int thirdNum = scanner2.nextInt();
            System.out.println("Введите четвертое число: ");
            int forthNum = scanner2.nextInt();

            int sumNum = firstNum + secondNum + thirdNum + forthNum;
            System.out.println("Сумма введенных чисел равна: " + sumNum);
        } catch (InputMismatchException e) {
            System.out.println("Неправильный формат числа");
        }

    }

    public static int divide(int x, int y) {
        if (y == 0) {
            throw new ArithmeticException("Деление на ноль невозможно");
        } else {
            return x / y;
        }
    }
}