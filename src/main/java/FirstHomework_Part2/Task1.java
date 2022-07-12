package FirstHomework_Part2;

import java.util.Scanner;

/**
 * За каждый год работы Петя получает на ревью оценку. На вход
 * подаются оценки Пети за последние три года (три целых положительных числа).
 * Если последовательность оценок строго монотонно убывает, то вывести "Петя,
 * пора трудиться"
 * В остальных случаях вывести "Петя молодец!"
 * Параметры
 * Scanner input = new Scanner(System.in);
 * int a = input.nextInt();
 * int b = input.nextInt();
 * int c = input.nextInt();
 *
 * @author Кашин Андрей
 */

public class Task1 {

    public static void main(String[] args) {

        System.out.println("Введите оценки");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        if ((a > b) && (b > c)){
            System.out.println("Петя, пора трудиться");
        } else {
            System.out.println("Петя Молодец!");
        }
    }
}
