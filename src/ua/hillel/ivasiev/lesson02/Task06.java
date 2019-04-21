package ua.hillel.ivasiev.lesson02;

public class Task06
{
  public static void main(String[] args)
  {
    // изввлечь в отдельный метод и назвать его
    // printMultiplicationTable(int from, int to)
    printMultiplicationTable();
  }

  private static void printMultiplicationTable()
  {
    for (int i = 1; i < 10; i++)
    {
      // Извлечь в в отдельный метод и назвать его
      // printTableForNumber(int number)
      int number = 3;
      printTableForNumber(number);
      System.out.println();
    }
  }

  private static void printTableForNumber(int i)
  {
    for (int j = 1; j < 10; j++)
    {
      System.out.printf("%d * %d = %d\n", i, j, i * j);
    }
  }
}
