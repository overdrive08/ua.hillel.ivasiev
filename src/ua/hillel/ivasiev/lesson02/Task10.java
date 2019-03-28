/*Определить позицию (индекс) элемента с числом n, если такого нет, вывести соответствующие сообщение */

package ua.hillel.ivasiev.lesson02;

public class Task10 {
    public static void main(String[] args) {
        int n = 8;
        int k = 1;
        int g = 0;
        int massive [] = new int [] {2,3,1,9,6,9};

        for (int i = 0; i < massive.length; i++){
            if (massive[i] == n) {k = i;
                //if (massive[i] != n)
            }else{g = 1;}
        }
        if (k >= 0)
            System.out.println(" Position Number n : " + k);
        else if (g == 1)
            System.out.println("Massive doesn't have number n");
    }
}
