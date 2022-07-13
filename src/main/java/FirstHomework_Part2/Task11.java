package FirstHomework_Part2;

import java.util.Scanner;

/**
 * Разобравшись со своими (и не только) задачками, Петя уже собирался
 * лечь спать и отдохнуть перед очередным тяжелым рабочим днем, но вдруг в
 * тишине раздается детский шепот: "Паааапааа, мы забыли решить ещё одну
 * задачку! Давай проверим, можно ли из трех сторон составить треугольник?".
 * Что ж, придется написать еще одну программу, связанную со школьной
 * математикой.
 * На вход подается три целых положительных числа – длины сторон
 * треугольника. Нужно вывести true, если можно составить треугольник из этих
 * сторон и false иначе.
 * Параметры
 * Scanner input = new Scanner(System.in);
 * int a = input.nextInt();
 * int b = input.nextInt();
 * int c = input.nextInt();
 *
 * @author Кашин Андрей
 */

public class Task11 {

    public static void main(String[] args) {

        System.out.println("Введите стороны треугольника");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        boolean result = ((a + b) > c) && ((b + c) > a) && ((c + a) > b);

        System.out.println(result);
    }
}
