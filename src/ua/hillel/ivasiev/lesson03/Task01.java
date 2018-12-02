/*1. Написать метод считающий сколько в строке встречается определеный символ.
Посчитать в ваших инициалах из первой задачи сколько пробелов и звездочек.*/
package ua.hillel.ivasiev.lesson03;

import java.util.Scanner;

public class Task01 {
    static Scanner scanner;
    public static void main(String[] args) {

        String name = "*        * * *\n" +
                "*      *\n" +
                "*      *\n" +
                "*        * *\n" +
                "*            *\n" +
                "*            *\n" +
                "*      * * *";
        int sim1 = 0;
        int sim2 = 0;
        for (char i = 0; i < name.length(); i++) {
            if (name.charAt(i) == ' '){
                sim1++;
            }
            if (name.charAt(i) == '*'){
                sim2++;
            }
        }
        System.out.println("Пробелов в строке = " + sim1);
        System.out.println("Символов * в строке = " + sim2);
        System.out.println(name);

    }
}
