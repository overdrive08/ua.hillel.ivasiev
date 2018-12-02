/*Найдите среднее арифметическое элементов массива*/

package ua.hillel.ivasiev.lesson02;

public class Task07 {
    public static void main(String[] args) {
        int massive [] = new int [] {1,2,3,4,5,6,7,8,9,10};
        double average= 0;
        int n = 0;

        for (int i = 0; i < massive.length; i++) {
            average += massive[i];
            n++;
        }
        average /=n;
        System.out.print(average + " ");
    }
}
