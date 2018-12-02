package ua.hillel.ivasiev.lesson02;

public class Task06 {
    public static void main(String[] args) {
        int massive [] = new int [] {1,2,3,4,5,6,7,8,9,10};
        int sum = 0;

        for (int i = 0; i < massive.length; i++) {
            sum += massive[i];
        }
        System.out.print(sum + " ");
    }
}
