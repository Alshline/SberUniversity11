package FirstHomework_Part1;

import java.util.Scanner;

/**
 *  На вход подается количеств миль – count. Переведите мили в
 * километры (1 миля = 1,60934 км) и выведите количество километров.
 * int count = scanner.nextInt();
 * // ваш код здесь
 *
 * @author Кашин Андрей
 * @return Километры
 */

public class Task6 {

    final static double KILOMETERS_PER_MILE = 1.60934;

    public static void main(String[] args) {

        System.out.println("Введите мили");
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();

        System.out.println("Полученные километры = " +count*KILOMETERS_PER_MILE);
    }
}
