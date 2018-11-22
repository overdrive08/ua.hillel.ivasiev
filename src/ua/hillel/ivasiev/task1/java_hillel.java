package ua.hillel.ivasiev.task1;
import java.util.Scanner;
import java.lang.String;

public class java_hillel {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println("Insert the number:");

        int num = user.nextInt();
        System.out.println("N = " + num);

        if (num < 0){
            System.out.println("Error");
            System.out.println("\n");
        } else {
            String binary = Integer.toBinaryString(num);
            System.out.println("Convert to binary is = " + binary);

            int a =Integer.parseInt(binary);
            int count = 0;
            while (a!=0){
                a %=2;
                if (a==1);
                count++;
                a = a/2;
                //if (a==0)
                   //return;
            }

            System.out.println("Number of units = " + count);

        }
    }
}
