package FirstHomework_Part2;

import java.util.Scanner;

/**
 * Раз так легко получается разделять по первому пробелу, Петя решил
 * немного изменить предыдущую программу и теперь разделять строку по
 * последнему пробелу.
 * Параметры
 * Scanner input = new Scanner(System.in);
 * String str = input.next();
 *
 * @author Кашин Андрей
 */

public class Task8 {

    public static void main(String[] args) {

        System.out.println("Введите вашу строку");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();

        int index = str.lastIndexOf(' ');
        String firstSubstring = str.substring(0,index);
        String secondSubstring = str.substring(index+1,str.length());

        System.out.println(firstSubstring);
        System.out.println(secondSubstring);
    }
}
