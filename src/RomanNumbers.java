public class RomanNumbers {


    static int numbers[] = {1, 4, 5, 9, 10, 50, 100};

    static String symbols[] = {"I", "IV", "V", "IX", "X", "L", "C"};


    public static int switchRomToInt(String romanNum) throws NumberFormatException {

        int intNum = 0;                                        // Наше конечная переменная типа int
        for(int i = 0; i < romanNum.length(); i++) {

            char ch = romanNum.charAt(i);              // измененняем передаваемый аргумент метода на переменную типа char
            int number = charToInt(ch);                // Меняем тип переменной ch на тип int

            if(number == -1) {
                throw new NumberFormatException("Unexpected number");   // Выбрасываем исключение, если наше число больше 10
            }

            intNum += number;
        }
        return intNum;                                             // Возвращаем полученное число
    }

    private static int charToInt (char symbol) {

        switch (symbol) {                          // Меняем римские цифры типа char на целочисленные числа типа int

            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            default:  return -1;
        }
    }

    public static String convertIntToString(int inputInt) {

        String romanString = "";
        int number = inputInt;

        while(number > 0) {

            for(int i = 0; i < numbers.length; i++) {

                if(number < numbers[i]) {
                    // Когда наше число будет меньше i-го числа в массиве numbers
                    number -= numbers[i - 1];                  //уменьшаем число на значение (i-1)-го члена массива numbers

                    romanString += symbols[i - 1];             // При этом добавляем (i-1)-ый член нассива symbols к римскому числу
                    break;
                }
            }
        }
        return romanString;                                  // Возвращаем полученное римское число типа String
    }
}
