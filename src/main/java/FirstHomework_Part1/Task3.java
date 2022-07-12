package FirstHomework_Part1;

import java.util.Scanner;

/**
 * Прочитайте из консоли имя пользователя и выведите в консоль строку:
 *  Привет, <имя пользователя>!
 *  String userName = scanner.next();
 *  // ваш код здесь
 *
 *  @author Кашин Андрей
 */

public class Task3 {

    public static void main(String[] args) {

        System.out.println("Введите имя пользователя");

        Scanner scanner = new Scanner(System.in);
        String userName = scanner.next();

        System.out.println("Привет, " +userName +"!");
    }
}
