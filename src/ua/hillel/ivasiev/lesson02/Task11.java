/*Определить позицию (индекс) элемента с числом n, если такого нет, вывести соответствующие сообщение
Решено правильным способом*/

package ua.hillel.ivasiev.lesson02;

public class Task11 {
    public static void main(String[] args) {
        int num = 9;
        int massive [] = new int [] {2,3,1,9,6,9};

        for (int i = 0; i < massive.length; i++){
            if (massive[i] == num){System.out.println(" Position Number :" + (i + 1)); return;}
        }
            System.out.println("Massive doesn't have number n");
    }
}