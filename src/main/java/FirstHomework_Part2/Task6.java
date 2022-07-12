package FirstHomework_Part2;

import java.util.Scanner;

/**
 *  На следующий день на работе Петю и его коллег попросили заполнить
 * анкету. Один из вопросов был про уровень владения английского. Петя и его
 * коллеги примерно представляют, сколько они знают иностранных слов. Также у
 * них есть табличка перевода количества слов в уровень владения английском
 * языком. Было бы здорово автоматизировать этот перевод!
 * На вход подается положительное целое число count - количество выученных
 * иностранных слов. Нужно вывести какому уровню соответствует это количество.
 * count < 500 beginner
 * 500 <= count < 1500 pre-intermediate
 * 1500 <= count < 2500 intermediate
 * 2500 <= count < 3500 upper-intermediate
 * 3500 <= count fluent
 * Параметры
 * Scanner input = new Scanner(System.in);
 * int count = input.nextInt();
 */

public class Task6 {

    public static void main(String[] args) {

        System.out.println("Введите количество слов");
        Scanner input = new Scanner(System.in);
        int count = input.nextInt();

        if (count > 0 && count < 500){
            System.out.println("beginner");
        } else if (count >= 500 && count < 1500) {
            System.out.println("pre-intermediate");
        } else if (count >= 1500 && count < 2500) {
            System.out.println("intermediate");
        } else if (count >= 2500 && count < 3500) {
            System.out.println("upper-intermediate");
        } else if (count >= 3500) {
            System.out.println("fluent");
        } else {
            System.out.println("unknown");
        }
    }
}
