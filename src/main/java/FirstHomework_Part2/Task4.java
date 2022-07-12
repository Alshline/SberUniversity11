package FirstHomework_Part2;

import java.util.Scanner;

/**
 *  После вкусного обеда Петя принимается за подсчет дней до выходных.
 * Календаря под рукой не оказалось, а если спросить у коллеги Феди, то тот
 * называет только порядковый номер дня недели, что не очень удобно. Поэтому
 * Петя решил написать программу, которая по порядковому номеру дня недели
 * выводит сколько осталось дней до субботы. А если же сегодня шестой
 * (суббота) или седьмой (воскресенье) день, то программа выводит "Ура,
 * выходные!"
 * Параметры
 * Scanner input = new Scanner(System.in);
 * int x = input.nextInt();
 *
 * @author Кашин Андрей
 */

public class Task4 {

    public static void main(String[] args) {

        System.out.println("Введите порядковый номер дня недели");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();

        if (x > 7 || x < 0){
            System.out.println("Неверный порядковый номер");
        } else if (x < 6){
            int y = 6 - x;
            System.out.println("Осталось дней до субботы " + y);
        } else {
            System.out.println("Ура, выходные!");
        }
    }
}
