package FirstHomework_Part2;

import java.util.Scanner;

/**
 * Петя снова пошел на работу. С сегодняшнего дня он решил ходить на
 * обед строго после полудня. Периодически он посматривает на часы (x - час,
 * который он увидел). Помогите Пете решить, пора ли ему на обед или нет. Если
 * время больше полудня, то вывести "Пора". Иначе - “Рано” На вход
 * гарантируется передача числа от 0 до 23 включительно.
 * Параметры
 * Scanner input = new Scanner(System.in);
 * int x = input.nextInt();
 *
 * @author Кашин Андрей
 */

public class Task3 {

    public static void main(String[] args) {

        System.out.println("Введите часы");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();

        if (x > 12) {
            System.out.println("Пора");
        } else {
            System.out.println("Рано");
        }
    }
}
