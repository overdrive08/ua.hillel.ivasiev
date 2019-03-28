package ua.hillel.ivasiev.lesson04;

import java.util.Scanner;

public class Task03_1_simplenumber {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println("Enter size array");

        int size1 = user.nextInt();
        int size = size1 + 1;
        int array[] = new int[size];

        //Заполняем массив отсортированными элементами
        array[0] = 0;
        for (int i = 1; i < size; i++) {
            array[i] = i;
            System.out.print(array[i] + "\t");
            if (i % 10 == 0) {
                System.out.println();
            }
        }
    }

    // Начинаем проверку на простые числа в отдельном методе
    public static void simpleNumber(int[] array) {
        for (int j = 2; j < array.length; j++) {

        }
    }
}

