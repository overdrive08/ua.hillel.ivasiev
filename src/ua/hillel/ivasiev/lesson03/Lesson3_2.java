/*2. Пользователь вводит целое десятичное число, требуется посчитать кольчиство едениц в двоичном предствлении этого числа.
пример 11 (десятичное) = 1011 (двоичное) программа должна вывести 3
подсказка Integer.toBinaryString
попробовать выполнить эту задачу без использования перевода в бинарную строку.*/
package ua.hillel.ivasiev.lesson03;

import java.lang.String;
import java.util.Scanner;

public class Lesson3_2 {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println("Insert the number:");

        int num = user.nextInt();
        System.out.println("N = " + num);

        if (num < 0) {
            System.out.println("Error");
            System.out.println("\n");
        } else {
            String binary = Integer.toBinaryString(num);
            System.out.println("Convert to binary is = " + binary);

            int a = Integer.parseInt(binary,2);
            int sumOfBinaryDigits = sumOfBinaryDigits(a);
            System.out.println("sumOfBinaryDigits="+sumOfBinaryDigits);

        }
    }

    private static int sumOfBinaryDigits(int a) {
        int count = 0;
        int b = 0;
        while (a != 0) {
            b = a % 2;
            a = a / 2;
            count += b;
        }
        return count;



    }
}