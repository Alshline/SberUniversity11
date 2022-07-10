package FirstHomework;

import java.util.Scanner;

/**
 * На вход подается двузначное число n. Выведите число, полученное
 * перестановкой цифр в исходном числе n.
 * int n = scanner.nextInt();
 * // ваш код здесь
 *
 * @author Кашин Андрей
 * @return Зеркальный результат
 */

public class Task7 {

    public static void main(String[] args) {

        System.out.println("Введите ваше число");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int rightFigure = n%10;
        int leftFigure = (n-rightFigure)/10;

        System.out.println(rightFigure +" " + leftFigure);
    }
}
