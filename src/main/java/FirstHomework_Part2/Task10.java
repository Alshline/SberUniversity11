package FirstHomework_Part2;

import java.util.Scanner;

/**
 * "А логарифмическое?" - не унималась дочь.
 * Напишите программу, которая проверяет, что log(e^n) == n для любого
 * вещественного n.
 * Параметры
 * Scanner input = new Scanner(System.in);
 * double n = input.nextDouble();
 *
 * @author Кашин Андрей
 */

public class Task10 {

    public static void main(String[] args) {

        System.out.println("Введите х");
        Scanner input = new Scanner(System.in);
        double n = input.nextDouble();

        double logarithm = Math.log( Math.pow(Math.E , n) );

        boolean result = logarithm == n;

        System.out.println(result);
    }
}
