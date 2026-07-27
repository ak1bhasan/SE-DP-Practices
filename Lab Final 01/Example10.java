import java.util.Scanner;

public class Example10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String str = Integer.toString(n);

        int converted = Integer.parseInt(str);

        System.out.println(str);
        System.out.println(str.length());
        System.out.println(converted);
    }
}
