package ua.hillel.ivasiev.lesson04;

public class Task04_Ches {
    public static void main(String[] args) {
        //int pole[][] = new int[8][8];
        int[][] pole = {
                {1,0,0,1,0,0,0,0},
                {0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0}
        };
        //System.out.println();
        int cnt = 0;

        //Начинаем проверку по строчкам
        for (int x = 0; x < 8; x++){
            for (int y = 0; y < 8; y++){
                if (pole[x][y] == 1) {cnt++;}
                if (cnt > 1) {System.out.println("Фигуры бьют одна другую\n" + "в строке " + x); return;}
            }
            cnt = 0;
        }
        //Закончили проверку по строчкам
        //Начинаем проверку по столбцам
        cnt = 0;
        for (int y = 0; y < 8; y++){
            for (int x = 0; x < 8; x++){
                if (pole[x][y] == 1) {cnt++;}
                if (cnt > 1) {System.out.println("Фигуры бьют одна другую\n" + "в столбце " + y); return;}
            }
            cnt = 0;
        }
        //Закончили проверку по столбцам
        System.out.println("Фигуры не бьют одна другую");
    }
}
