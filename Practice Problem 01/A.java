import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int target = n % 100;

        // System.out.println(target);

        System.out.println(100 - target);

    }
}