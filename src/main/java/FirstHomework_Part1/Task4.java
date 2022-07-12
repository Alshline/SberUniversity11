package FirstHomework_Part1;

import java.util.Scanner;

/**
 * На вход подается количество секунд, прошедших с начала текущего
 * дня – count. Выведите в консоль текущее время в формате: часы и минуты.
 * int count = scanner.nextInt();
 * // ваш код здесь
 *
 * @author Кашин Андрей
 * @return Текущее время
 */

public class Task4 {

    final static int SECONDS_PER_MINUTE = 60;
    final static int MINUTE_PER_HOUR = 60;

    public static void main(String[] args) {

        System.out.println("Введите количество секунд");
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();

        int minutes = count/SECONDS_PER_MINUTE;
        int hours = minutes/MINUTE_PER_HOUR;
        int currentMinutes = minutes%MINUTE_PER_HOUR;
        // maybe (count/SECONDS_PER_MINUTE)%MINUTE_PER_HOUR) better

        System.out.println("Текущее время:");
        System.out.println(hours +" "+ currentMinutes);
    }
}
