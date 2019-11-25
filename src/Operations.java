import java.util.InputMismatchException;

public class Operations {

    public int calc(int num1, String operation, int num2) throws InputMismatchException {


        int result;


        if (num1 > 0 && num1 < 11 && num2 > 0 && num2 < 11) {

            switch (operation) {
                case "+":
                    result = num1 + num2;
                    break;

                case "-":
                    result = num1 - num2;
                    break;

                case "/":
                    result = num1 / num2;
                    break;

                case "*":
                    result = num1 * num2;
                    break;
                default:
                    throw new InputMismatchException();

            }
        } else {
            throw new InputMismatchException();
        }
        return result;
    }
}