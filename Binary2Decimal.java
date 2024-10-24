import java.util.Scanner;

public class Binary2Decimal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        int decimal = Integer.parseInt(a, 2);
        System.out.println(decimal);
        s.close();
    }

}
