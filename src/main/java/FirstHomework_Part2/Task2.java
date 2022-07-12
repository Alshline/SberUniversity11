package FirstHomework_Part2;

import java.util.Scanner;

/**
 *  Петя пришел домой и помогает дочке решать математику. Ей нужно
 * определить, принадлежит ли точка с указанными координатами первому
 * квадранту. Недолго думая, Петя решил автоматизировать процесс и написать
 * программу: на вход нужно принимать два целых числа (координаты точки),
 * выводить true, когда точка попала в квадрант и false иначе.
 * Но сначала Петя вспомнил, что точка лежит в первом квадранте тогда, когда её
 * координаты удовлетворяют условию: x >= 0 и y >= 0.
 * Параметры
 * Scanner input = new Scanner(System.in);
 * int x = input.nextInt();
 * int y = input.nextInt();
 *
 * @author Кашин Андрей
 */

public class Task2 {

    public static void main(String[] args) {

        System.out.println("Введите координаты");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();

        boolean result = (x >= 0) && (y >= 0);

        System.out.println(result);
    }
}
