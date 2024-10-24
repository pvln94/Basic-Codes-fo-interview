import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        String reversed = reverse(a);
        System.out.println("Reveresed string: " + reversed);
        s.close();

    }

    public static String reverse(String a) {
        StringBuilder reversed = new StringBuilder(a);
        return reversed.reverse().toString();

    }

}
