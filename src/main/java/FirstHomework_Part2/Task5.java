package FirstHomework_Part2;

import java.util.Scanner;

/**
 * Дома дочери Пети опять нужна помощь с математикой! В этот раз ей
 * нужно проверить, имеет ли предложенное квадратное уравнение решение или
 * нет.
 * На вход подаются три числа - коэффициенты уравнения a, b, c. Нужно вывести
 * "Решение есть", если оно есть и "Решения нет", если нет.
 * Параметры
 * Scanner input = new Scanner(System.in);
 * int a = input.nextInt();
 * int b = input.nextInt();
 * int c = input.nextInt();
 *
 * @author Кашин Андрей
 */

public class Task5 {

    public static void main(String[] args) {

        System.out.println("Введите коэффициенты уравнения");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        double discriminant = Math.pow(b,2) - 4*a*c;
        if (discriminant<0){
            System.out.println("Решения нет");
        } else {
            System.out.println("Решение есть");
        }
    }
}
