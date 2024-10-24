import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        while (b != 0) {
            int temp = a;
            a = b;
            b = temp % b;
        }
        System.out.println(a);
        s.close();
    }

}
