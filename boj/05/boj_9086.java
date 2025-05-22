import java.util.Scanner;

public class boj_9086 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        for(int i = 0; i<n; i++){
            String str = scan.next();
            System.out.println(str.charAt(0)+str.charAt(str.length()-1));
        }
        scan.close();

    }
}
