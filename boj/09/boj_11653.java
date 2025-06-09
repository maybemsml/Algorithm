import java.util.Scanner;

public class boj_11653 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        scan.close();

        // 소인수분해
        for(int i=2; i<=n; i++) {
            while(n % i == 0) {
                System.out.println(i);
                n /= i;
            }
        }
    }
}
