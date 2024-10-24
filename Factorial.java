import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();

        System.out.println("Factorial: " + factorial(a));
        s.close();

    }

    public static int factorial(int a) {
        if (a == 0 || a == 1) {
            return 1;
        } else {
            return a * factorial(a - 1);
        }
    }

}
