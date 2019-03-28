package ua.hillel.ivasiev.Calc;

public class Conversion {


    public int romanToDecimal(String romanNumber) {
        int result = 0;
        int lastNumber = 0;
        int age = -1;
        String romanNumeral = romanNumber.toUpperCase();

        try { age = Integer.parseInt(romanNumber);
        if (age <= 10)
            result = age;
        else
            System.out.println(" Введите число от 0 до 10");
        }
        catch (NumberFormatException e){
        }


        for (int x = romanNumeral.length() - 1; x >= 0; x--) {
            char convertToDecimal = romanNumeral.charAt(x);

            switch (convertToDecimal) {
                case 'X':
                    result = processDecimal(10, lastNumber, result);
                    lastNumber = 10;
                    break;

                case 'V':
                    result = processDecimal(5, lastNumber, result);
                    lastNumber = 5;
                    break;

                case 'I':
                    result = processDecimal(1, lastNumber, result);
                    lastNumber = 1;
                    break;
            }
        }
        return result;
    }

    private int processDecimal(int decimal, int lastNumber, int lastDecimal) {
        if (lastNumber > decimal) {
            return lastDecimal - decimal;
        } else {
            return lastDecimal + decimal;
        }
    }
}
