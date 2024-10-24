import java.util.Scanner;

public class largestof3numbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a:");
        int a = s.nextInt();

        System.out.println("Enter b:");
        int b = s.nextInt();

        System.out.println("Enter c:");
        int c = s.nextInt();

        int largest = Math.max(a, Math.max(b, c));
        System.out.println("largest is" + largest);

        s.close();

    }

}
