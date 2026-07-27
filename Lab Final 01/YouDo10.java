import java.util.Scanner;

public class YouDo10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String str = Integer.toString(n);

        int converted = Integer.parseInt(str);

        
        System.out.println("Integer Value : " + n);
        System.out.println("Length of String : " + str.length());
        System.out.println("String Value : " + str);
        System.out.println("Converted Integer Value : " + converted);
    }
}
