/*Создать массив размером n, элементами, которого будут числа от 1 до n.*/

package ua.hillel.ivasiev.lesson02;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int massive [] = new int[n];
        for (int i = 0; i < massive.length; i++) {
            massive[i] = i + 1;
            System.out.print(massive[i] + " ");
        }
    }
}
