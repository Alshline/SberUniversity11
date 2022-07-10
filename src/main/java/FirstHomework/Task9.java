package FirstHomework;

import java.util.Scanner;

/**
 *  На вход подается бюджет мероприятия – n тугриков. Бюджет на одного
 * гостя – k тугриков. Вычислите и выведите, сколько гостей можно пригласить на
 * мероприятие.
 * int n = scanner.nextInt();
 * int k = scanner.nextInt();
 * // ваш код здесь
 *
 * @author Кашин Андрей
 * @return Количество гостей
 */

public class Task9 {

    public static void main(String[] args) {

        System.out.println("Введите ваш бюджет");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println("Введите бюджет на одного гостя");
        int k = scanner.nextInt();

        System.out.println("Допустимое количество гостей = " +n/k);
    }
}
