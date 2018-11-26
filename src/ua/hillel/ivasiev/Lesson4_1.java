package ua.hillel.ivasiev;

import java.util.Scanner;

public class Lesson4_1 {
    public static void main(String[] args){
        System.out.println("Enter data array");
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int array[] = new int[size];

        for (int i = 0; i < size; i++)
            array [i] = input.nextInt();

        System.out.println(" Input =" + array);

    }
}
