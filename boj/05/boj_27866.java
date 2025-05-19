import java.util.Scanner;

public class boj_27866 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       
        String str = scan.next();
        int n = scan.nextInt()-1;

        scan.close();

        System.out.println(str.charAt(n));

    }
}
