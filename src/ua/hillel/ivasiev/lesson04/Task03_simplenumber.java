package ua.hillel.ivasiev.lesson04;

import java.util.Scanner;

public class Task03_simplenumber {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println("Enter size array");

        int size = user.nextInt();
        int array[] = new int[size];

        //Заполняем массив отсортированными элементами
        for (int i = 2; i < size ; i++) {
            if (array[i] != -1) {
                System.out.println(i);
            }

            int j = i;
            int count = 1;
            while (j < size ) {
                array[j] = -1;
                count++;
                j = i * count;
            }
//            array[i] = i;
//            System.out.print(array[i] + " ");
//            if (i%5==0){System.out.println();}
        }

        // Начинаем проверку на простые числа
        //for (int j = 0; j < array.length; j++);
    }
}
