/*Выведите все четные элементы массива*/

package ua.hillel.ivasiev.lesson02;

public class Task05 {
    public static void main(String[] args) {
        int massive [] = new int [] {1,2,3,4,5,6,7,8,9,10};
        System.out.print("Четные элементы массива: \n");
        for (int i = 0; i < massive.length; i++) {
            if (massive[i]%2==0) {
                System.out.print(massive [i] + " ");
            }
        }
    }
}
