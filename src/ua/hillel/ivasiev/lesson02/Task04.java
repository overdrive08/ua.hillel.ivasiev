/* Вывести элементы массива, котороые деляться на 3 без остатка*/

package ua.hillel.ivasiev.lesson02;

public class Task04 {
    public static void main(String[] args) {
        int massive [] = new int [] {1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i < massive.length; i++) {
            massive[i] = massive[i]/3;
            System.out.print(massive [i] + " ");
        }
    }
}
