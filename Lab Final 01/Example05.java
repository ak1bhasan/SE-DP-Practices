import java.util.Scanner;

public class Example05{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for( int i = 0; i < n; i++ ) arr[i] = sc.nextInt();

        for( int u : arr ) System.out.print(u + " ");

    }
}