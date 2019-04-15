//Сортировка алгоритмом пузырька
package ua.hillel.ivasiev.lesson01;

import java.util.Random;
import java.util.Arrays;

public class Task02 {
    public static void main(String[] args) {
        int mas[] = new int[100];
        Random rand = new Random();

        for (int i = 0; i < 100; i++) {
            mas [i] = rand.nextInt(100);
            //System.out.print(mas[i] + "\t" + " ");
        }
        System.out.println("The array was populated with random: \n" + Arrays.toString(mas));
        bubbleSort(mas);
        System.out.println("After bubble sorting: \n" + Arrays.toString(mas));
        System.out.println("The first maximum three numbers of the array:");

        for (int i = 0; i < 3; i++){
            //mas[i] = i;
            System.out.print(mas[i] + " ");
        }
    }

    private static void bubbleSort (int[] mas){
        int j;
        boolean flag = true;
        int temp;

        while (flag) {
            flag = false;
            for (j = 0; j < mas.length - 1; j++) {
                if (mas[j] < mas[j + 1]) {
                    temp = mas[j];
                    mas[j] = mas[j + 1];
                    mas[j + 1] = temp;
                    flag = true;
                }
            }
        }
    }
}
