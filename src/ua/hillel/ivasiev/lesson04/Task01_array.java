/*1. Пользователь вводит отсортированный массив чисел и еще одно число. Требуется сформировать новый отсортированый массив
котрый соостоит из исходного и нового числа.*/

package ua.hillel.ivasiev.lesson04;

import java.util.Scanner;

public class Task01_array {
    public static void main(String[] args) {
        //вызов метода
        insert();

    }

    private static void insert() {
        //ввод размера массива
        System.out.println("Enter data array");
        Scanner input = new Scanner(System.in);

        int size = input.nextInt();
        int array[] = new int[size];

        // ввод с консоли каждого элемента массива (заведома отсортированный)
        System.out.println("Insert array elements:");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }

        // вывод массива в консоль
        System.out.println("Insert array elements:");
        for (int i = 0; i < size; i++) {
            System.out.print(" " + array[i]);
        }

        //ввод числа, которое нужно вставить в массив
        System.out.println("\nEnter User number:");
        int userN = input.nextInt();
        boolean a = false;
        int newarray[] = new int[size + 1];
        newarray[size] = userN;
        //System.out.println(userN);


        // определение места введенного числа в массив
        for (int i = 0; i < array.length; i++) {
            if ((userN < array[i]) && (a==false)) {
                newarray[i] = userN;
                a = true;
                newarray[i + 1] = array[i];

            } else {
                if (a == false) {
                    newarray[i] = array[i];
                } else {
                    newarray[i + 1] = array[i];
                }
            }
            //System.out.print(" " + newarray[i]);
        }
        for (int i = 0; i < newarray.length; i++) {
            System.out.print(" " + newarray[i]);
        }
    }
}

