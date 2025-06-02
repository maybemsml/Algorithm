import java.util.Scanner;


public class boj_2675 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        
        for (int i = 0; i < n; i++) {
            int r = scan.nextInt();
            String s = scan.next();
            
            StringBuilder str = new StringBuilder();
            
            for (int j = 0; j < s.length(); j++) {
                char c = s.charAt(j);
                for (int k = 0; k < r; k++) {
                    str.append(c);
                }
            }
            
            System.out.println(str.toString());
        }
        scan.close();
    }
}

