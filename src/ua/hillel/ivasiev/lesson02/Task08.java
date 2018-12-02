/*Определить сумму минимального и максимального элементов массива*/

package ua.hillel.ivasiev.lesson02;

public class Task08 {
    public static void main(String[] args) {
        int massive [] = new int[] {1,5,7,8,9,6,5,4,10,-2};
        int max = 0;
        int min = 0;
        int sum;

        for (int i=0; i < massive.length; i++) {
            if (max < massive[i])
            max = massive[i];
            if (min > massive[i])
            min = massive[i];
        }
        System.out.println("Max : " + max);
        System.out.println("Min : " + min);
        System.out.println("SumMin+Max = " + (max + min));
    }
}
