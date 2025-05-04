// 공백주의
import java.util.Scanner;

public class boj_11022 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();

        for(int i=0; i < t; i++){
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = a+b;

            System.out.println("Case #" + (i+1) + ": " + a + " + " + b + " = " + c);
        }
        scan.close();
    }
}
