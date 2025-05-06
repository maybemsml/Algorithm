import java.util.Scanner;

public class boj_2439 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        scan.close();

        for(int i=1; i <= n; i++){
            for(int b=1; b <= n-i; b++){
                System.out.print(" ");
            }
            for(int s=1; s <= i; s++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
