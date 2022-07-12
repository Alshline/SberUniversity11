package FirstHomework_Part1;

import java.util.Scanner;

/**
 * На вход подается два целых числа – a и b. Вычислите и выведите среднее квадратическое a и b.
 *
 * @author Кашин Андрей
 * @return Среднее квадратичное значение
 */

public class Task2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите значение а");
        int a = scanner.nextInt();
        System.out.println("Введите значение b");
        int b = scanner.nextInt();

        double averageResult = (a+b)/2;
        double quadraticAverage = Math.sqrt(Math.abs((Math.pow(a,2)+Math.pow(b,2))/2));

        System.out.println("Среднее квадратичное чисел a и b = " +quadraticAverage);
    }
}
