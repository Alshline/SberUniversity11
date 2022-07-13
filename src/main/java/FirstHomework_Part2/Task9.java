package FirstHomework_Part2;

import java.util.Scanner;

/**
 * Пока Петя практиковался в работе со строками, к нему подбежала его
 * дочь и спросила: "А правда ли, что тригонометрическое тождество (sin^2(x)+
 * cos^2(x) - 1 == 0) всегда-всегда выполняется?"
 * Напишите программу, которая проверяет, что при любом x на входе
 * тригонометрическое тождество будет выполняться (то есть будет выводить true
 * при любом x).
 * Параметры
 * Scanner input = new Scanner(System.in);
 * int x = input.nextInt();
 *
 * @author Кашин Андрей
 */

public class Task9 {

    public static void main(String[] args) {

        System.out.println("Введите х");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();

        double squareOfSinus = Math.pow( Math.sin(Math.toRadians(x)) , 2);
        double squareOfCosinus = Math.pow( Math.cos(Math.toRadians(x)) , 2);

        boolean result = (squareOfSinus + squareOfCosinus -1) == 0;

        System.out.println(result);
    }
}
