package ua.hillel.ivasiev.Classlesson03;

public class CommandLineParam {
    public static void main(String[] args) {
        String arg = args[0];
        System.out.println(arg);
        String arg1 = args[1];
        System.out.println(arg1);

        int i = Integer.parseInt(arg);
        int j = Integer.parseInt(arg1);
        System.out.println(i + j);
    }
}
