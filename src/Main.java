import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InputMismatchException {

        Scanner scanner = new Scanner(System.in);              // Создаем экземпляр класса Scanner
        System.out.println("Input: ");

        RomanNumbers changeNum = new RomanNumbers();
        Operations calculation  = new Operations();


        if (scanner.hasNextInt()) {

            int userNum1 = scanner.nextInt();                           // Если две входящие фразы содержат числа от 1 до 10
            String operation = scanner.next();
            int userNum2 = scanner.nextInt();

            int result = calculation.calc(userNum1, operation, userNum2);

            System.out.println("Output: ");
            System.out.println(result);


        } else if (scanner.hasNext()) {

            String a = scanner.next();
            String oper = scanner.next();
            String b = scanner.next();

            boolean check = a.matches("\\d+");                 // Проверяем содержат ли наши  входящие фразы числа
            boolean check1 = b.matches("\\d+");

            if ((check == false && check1 == true) || (check == true && check1 == false)) {
                throw new InputMismatchException();                // Если одна из вх.фраз содержит число, выбрасываем исключение
            }
            int anum =  changeNum.switchRomToInt(a);               // Если две входящие фразы содержат римские цифры от 1 до 10
            int bnum = changeNum.switchRomToInt(b);


            int endResult = calculation.calc(anum, oper, bnum);
            String romanNumber = changeNum.convertIntToString(endResult); // После вычисления операции возвращаем целочисленное число в римскую цифру

            System.out.println("Output: ");
            System.out.println(romanNumber);


        } else {                                            // Во всех других случаях выбрасываем исключение
            throw new InputMismatchException();
        }
    }
}

