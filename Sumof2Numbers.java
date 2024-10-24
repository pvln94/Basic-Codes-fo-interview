import java.util.Scanner;

public class Sumof2Numbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a:");
        int a = s.nextInt();

        System.out.print("Enter b:");
        int b = s.nextInt();

        System.out.println("Sum:" + (a + b));
        s.close();

    }

}
