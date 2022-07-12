package FirstHomework_Part2;

import java.util.Scanner;

/**
 * Петя недавно изучил строки в джаве и решил попрактиковаться с ними.
 * Ему хочется уметь разделять строку по первому пробелу. Для этого он может
 * воспользоваться методами indexOf() и substring().
 * На вход подается строка. Нужно вывести две строки, полученные из входной
 * разделением по первому пробелу.
 * Параметры
 * Scanner input = new Scanner(System.in);
 * String str = input.next();
 *
 * @author Кашин Андрей
 */

public class Task7 {

    public static void main(String[] args) {

        System.out.println("Введите вашу строку");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();

        int index = str.indexOf(' ');
        String firstSubstring = str.substring(0,index);
        String secondSubstring = str.substring(index+1,str.length());

        System.out.println(firstSubstring);
        System.out.println(secondSubstring);
    }
}
