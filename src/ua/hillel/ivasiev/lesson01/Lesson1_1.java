// Замена чисел у переменных а и в
package ua.hillel.ivasiev.lesson01;

public class Lesson1_1 {
    public static void main(String[] args) {
        var a = 2.0;
        var b = 1.1;
        var c = 8;
        var d = 2;

        a = a + b;
        b = a - b;
        a = a - b;
        c = c * d;
        d = c / d;
        c = c / d;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
    }
}
