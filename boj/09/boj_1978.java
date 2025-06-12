import java.util.Scanner;

public class boj_1978 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int count = 0;

        for(int i=0; i<n; i++){
            int number = scan.nextInt();
            for(int j = 2; j <= number; j++) {
                if(j == number) {
                    count++;
                }
                if(number % j == 0) {
                    break;
                }
            }
         }
         scan.close();
         System.out.println(count);
    }
}
