package FirstHomework_Part1;

import java.util.Scanner;

/**
 * Переведите дюймы в сантиметры (1 дюйм = 2,54 сантиметров). На
 * вход подается количество дюймов, выведите количество сантиметров.
 * int count = scanner.nextInt();
 * // ваш код здесь
 *
 * @author Кашин Андрей
 * @return Сантиметры
 */

public class Task5 {

    final  static  double CENTIMETERS_PER_INCH = 2.54;

    public static void main(String[] args) {

        System.out.println("Введите количество дюймов");
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();

        System.out.println("Полученное количество сантиметров = " +(double)count*CENTIMETERS_PER_INCH);
    }
}
