import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char operator;
        double a, b, res;

        System.out.println("Enter the operator: ");
        operator = s.next().charAt(0);
        a = s.nextInt();
        b = s.nextInt();

        switch (operator) {
            case '+':
                res = a + b;
                System.out.println(res);
                break;
            case '-':
                res = a - b;
                System.out.println(res);
                break;
            case '*':
                res = a * b;
                System.out.println(res);
                break;
            case '/':
                if (b != 0) {
                    res = a / b;
                    System.out.println(res);
                    break;
                } else {
                    System.out.println("Division is not possible");
                    break;
                }
            default:

                System.out.println("Invalid Operation");
                break;

        }
        s.close();
    }

}
