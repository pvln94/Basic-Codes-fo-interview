import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int original = a;
        int sum = 0;
        int digits = Integer.toString(a).length();

        while (a != 0) {
            int digit = a % 10;
            sum += Math.pow(digit, digits);
            a /= 10;
        }

        if (sum == original) {
            System.out.println("It is Armstrong number");

        } else {
            System.out.println("It is not a Armstrong number");
        }

        s.close();
    }

}
