package ua.hillel.ivasiev.task1;

import java.util.Random;
import java.util.Scanner;

public class java_hillel {
    static Scanner scanner;
    public static void main(String[] args) {
        var a = 2.0;
        var b = 1.1;
        var c = 8;
        var d = 2;

        a = a + b;
        b = a - b;
        a = a - b;

        c = c * d;
        d = c / d;
        c = c / d;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);


        int[][] mas2d = new int[10][10];
        Random rand = new Random();

        for (int i = 0; i < 10; i++)
            for (int j = 0; j < 10; j++)
                mas2d[i][j] = rand.nextInt(100);

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++)
                System.out.print(mas2d[i][j] + "\t" + " ");
            System.out.println();
        }
        System.out.println("*        * * *\n" +
                            "*      *\n" +
                            "*      *\n" +
                            "*        * *\n" +
                            "*            *\n" +
                            "*            *\n" +
                            "*      * * *");
    }
}
