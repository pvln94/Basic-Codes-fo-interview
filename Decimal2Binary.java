import java.util.Scanner;

public class Decimal2Binary {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        String binary = Integer.toBinaryString(a);
        System.out.println(binary);

        s.close();

    }

}
