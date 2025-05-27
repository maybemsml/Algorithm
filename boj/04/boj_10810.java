import java.util.Scanner;

public class boj_10810 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt(); // 바구니
        int m = scan.nextInt(); // 몇 번 던질 것인지

        int arr[] = new int[n];

        for(int a=0; a<m; a++){
            int i = scan.nextInt();
            int j = scan.nextInt();
            int k = scan.nextInt();

            for(int b= i-1; b<j; b++){
                arr[b] = k;
            }
        }

        scan.close();

        for (int b = 0; b < n; b++) {
            System.out.print(arr[b] + " ");
        }    
    }
}
