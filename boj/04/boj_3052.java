import java.util.HashSet;
import java.util.Scanner;

public class boj_3052 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        HashSet<Integer> count = new HashSet<Integer>();
        
        for(int i=0; i<10; i++){
            int n = scan.nextInt();
            count.add(n % 42);
        }

        scan.close();
        System.out.println(count.size());
    }
}
