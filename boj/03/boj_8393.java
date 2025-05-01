import java.util.Scanner;

public class boj_8393 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int sum = 0;

        scan.close();
        
        for(int i = 0; i <= a; i++){
            sum += i;
        }
        System.out.println(sum);
    }
}
