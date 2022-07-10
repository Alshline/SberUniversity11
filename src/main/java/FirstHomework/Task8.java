package FirstHomework;

import java.util.Scanner;

/**
 *  На вход подается баланс счета в банке – n. Рассчитайте дневной
 * бюджет на 30 дней.
 * int n = scanner.nextInt();
 * // ваш код здесь
 *
 * @author Кашин Андрей
 * @return Бюджет
 */

public class Task8 {

    final static int DAYS_PER_MONTH = 30;

    public static void main(String[] args) {

        System.out.println("Введите баланс");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println("Ваш бюджет = " +(double) n/DAYS_PER_MONTH);
    }
}
