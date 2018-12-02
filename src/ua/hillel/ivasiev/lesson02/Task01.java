/*Вывести первые 5 элементов массива, у которого размер 10*/
package ua.hillel.ivasiev.lesson02;

public class Task01 {
    public static void main(String[] args) {
        int massive [] = new int [] {1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i < 5; i++) {
            System.out.print(massive[i] + " ");
        }
    }
}
