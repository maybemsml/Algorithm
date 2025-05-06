import java.util.Scanner;

public class boj_2438 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        scan.close();

        for(int i=1; i <= n; i++){
            for(int r=1; r <= i; r++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
