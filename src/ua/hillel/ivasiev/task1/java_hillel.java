package ua.hillel.ivasiev.task1;

import java.util.Scanner;
import java.lang.String;

public class java_hillel {
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

