package ua.hillel.ivasiev.lesson01;
import java.awt.Graphics;

public class Task01 {
    public static void main(String[] args) {
        Task01 printer = new Task01();

        printSquare();
        printTriangle();
        printLeftTriagle();
        printRightTriagle();
        printRhumbus();
        printChessBoard(); // что означает printer.printChessBoard(); ?
    }

    private static void printSquare() {
        for (int i = 0; i <= 0; i++) {
            System.out.println("1.\n" + "********");
            for (int j = 0; j <= 3; j++) {
                System.out.print("*      *\n");
            }
            System.out.println("********");
        }
    }

    private static void printTriangle() {
        System.out.println("2.");

        for (int i = 0; i < 4; i++)
            System.out.println("   *******".substring(i, 4 + 2 * i)); // решение подсказал интернет)

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5 - i; j++)
                System.out.print(" ");
            for (int k = 0; k < (2 * i + 1); k++)
                System.out.print("*");
            System.out.println();
        }
    }

    private static void printLeftTriagle() {
        int count = 6;
        System.out.print("3.");

        for (int i = 0; i <= count; i++) {
            for (int j = 0; j < i; j++)
                System.out.print("*");
            System.out.println();
        }
    }

    private static void printRightTriagle() {
        System.out.println("4.");

        for (int i = 0; i < 6; i++)
            System.out.println("     *******".substring(i, 6 + i));
    }

    private static void printRhumbus() {           // пустой ромб из звезд пока не знаю как реализовать изучаю алгоритм брезенхема
        System.out.println("5.");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i + 2; j++) {
                System.out.print(" ");
            }
            for (int k = 8; k > (i * 2 + 1); k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void printChessBoard() {
        System.out.println("6.");

        for (int i = 0; i <= 3; i++) {
            System.out.println("********");
            for (int j = 0; j <= 0; j++) {
                System.out.print(" ********\n");
            }
        }
    }
}
