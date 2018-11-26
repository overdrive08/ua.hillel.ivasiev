/*1. Пользователь вводит отсортированный массив чисел и еще одно число. Требуется сформировать новый отсортированый массив
котрый соостоит из исходного и нового числа.*/

package ua.hillel.ivasiev;

import java.util.Scanner;

public class Lesson4_1 {
    public static void main(String[] args) {
        int n;
        
        Scanner s = new Scanner(System.in);
        n = s.nextInt() + 2;
        int fib [] = new int[n];

        fib [0] = 0;
        fib [1] = 1;

        for (int i = 1; i < n-1; i++) {
            fib[i + 1] = fib[i] + fib[i - 1];
            System.out.print(fib[i] + " ");
        }
    }
}
