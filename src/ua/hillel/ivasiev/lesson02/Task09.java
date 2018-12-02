/*Определить произведение всех нечетных элементов массива*/

package ua.hillel.ivasiev.lesson02;

public class Task09 {
    public static void main(String[] args) {
        int massive [] = new int [] {1,2,3,4,5,6,7,8,9,10};
        int massum = 0;

        System.out.print("Нечетные элементы массива: \n");
        for (int i = 0; i < massive.length; i++) {
            if (massive[i]%2!=0) {
                massum += massive [i];
                System.out.print(massive [i] + " ");
            }
        }
        System.out.println(" \nSum = " + massum);
    }
}
