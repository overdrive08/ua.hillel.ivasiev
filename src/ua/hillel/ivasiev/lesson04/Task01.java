package ua.hillel.ivasiev.lesson04;

import java.util.Scanner;

public class Task01 {
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
