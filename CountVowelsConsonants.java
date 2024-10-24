import java.util.Scanner;

public class CountVowelsConsonants {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        a = a.toLowerCase();
        int c = 0;
        int v = 0;
        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                v++;
            } else if (ch >= 'a' && ch <= 'z') {
                c++;
            }

        }
        System.out.println(v + " " + c);
        s.close();

    }

}
