import java.util.Scanner;

public class boj_10813 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int bucket = scan.nextInt();
        int turn = scan.nextInt();

        int arr[] = new int[bucket];

        for(int b = 0; b < arr.length; b++){
            arr[b] = b+1;
        }

        // 공 교환 (r=임시)

        for(int c = 0; c<turn; c++){
            int i = scan.nextInt();
            int j = scan.nextInt();
            
            int r = arr[i-1];
            arr[i-1] = arr[j-1];
            arr[j-1] = r;
        }

        scan.close();

        for(int fin=0; fin<arr.length; fin++){
            System.out.print(arr[fin]+" ");
        }
    }
}
