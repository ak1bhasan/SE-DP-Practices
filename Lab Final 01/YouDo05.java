import java.util.Scanner;

public class YouDo05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 6;

        int[] arr = new int[n];

        for( int i = 0; i < n; i++ ) arr[i] = sc.nextInt();

        System.out.println(arr[n - 1]);

    }    
}
