/*1. Вывести рандомно массив 10х10 со значениями от 0-100 и свои инициалы*/
package ua.hillel.ivasiev.lesson01;

import java.util.Random;
import java.util.Scanner;


public class Task01 {
    static Scanner scanner;

    public static void main(String[] args) {

        /*int[][] mas2d = new int[10][10];
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
                "*      * * *");*/
        test();
        init();
    }


    private static void test() {
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
    }

    private static void init(){
        System.out.println("*        * * *\n" +
                "*      *\n" +
                "*      *\n" +
                "*        * *\n" +
                "*            *\n" +
                "*            *\n" +
                "*      * * *");
    }
}