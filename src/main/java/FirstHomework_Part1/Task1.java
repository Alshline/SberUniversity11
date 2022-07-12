package FirstHomework_Part1;

import java.util.Scanner;

/** Вычислите и выведите объем шара, прочитав его радиус r с консоли.
 * Примечание: считать по формуле V = 4/3 * 3.14 * r^3
 *     Scanner scanner = new Scanner(System.in);
 *     int r = scanner.nextInt();
 * // ваш код здесь
 *
 * @author Кашин Андрей
 * @return V - Объем шара
 */

public class Task1 {

    public static void main(String[] args) {

        System.out.println("Введите радиус шара");

        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();
        double v = (4.0/3)*3.14*Math.pow(r,3);

        System.out.println("Объем шара = " +v);
    }
}
