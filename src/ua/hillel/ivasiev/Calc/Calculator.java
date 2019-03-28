package ua.hillel.ivasiev.Calc;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        String num1;
        String num2;
        String Operation;
        int i = 1;

        Conversion s = new Conversion();

        metka:
        while (i<2) {
        System.out.println("Введите первое число ");
        Scanner scn = new Scanner(System.in);
        num1 = scn.nextLine();
        int number1 = s.romanToDecimal(num1);

        //if (number1>=10) break metka;

        System.out.println("Введите второе число ");
        num2 = scn.nextLine();
        int number2 = s.romanToDecimal(num2);

        //System.out.println(number1);
        //System.out.println(number2);

        System.out.println("Введите операцию (*,/,+,-)");
        Operation = scn.next();


        switch (Operation) {
            case "+": System.out.println("Результат вычислений = " + (number1 + number2)); break;
            case "-": System.out.println("Результат вычислений = " + (number1 - number2)); break;
            case "*": System.out.println("Результат вычислений = " + (number1 * number2)); break;
            case "/": System.out.println("Результат вычислений = " + (number1 / number2)); break;
            }
        }
    }
}
