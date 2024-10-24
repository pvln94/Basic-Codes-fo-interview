import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        System.out.println("Fibonacci of input:");
        fibonacci(a);
        s.close();

    }

    public static void fibonacci(int a) {
        int x = 0;
        int y = 1;
        for (int i = 0; i < a; i++) {
            System.out.println(x + " ");
            int temp = x;
            x = y;
            y = temp + y;

        }
        System.out.println();

    }

}
