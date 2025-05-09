import java.util.Scanner;

public class boj_10807 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int arr[] = new int[n];

        for(int i=0; i<arr.length; i++){
            arr[i] = scan.nextInt();
        }

        int x = scan.nextInt();
        int count = 0;
        scan.close();

        for(int i=0; i<arr.length; i++){
            if(arr[i] == x){
                count++;
            }
        }
        System.out.println(count);

    }
}
