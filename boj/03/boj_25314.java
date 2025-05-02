// 반복문 해당 구간 주의할 것
import java.util.Scanner;

public class boj_25314 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();

        scan.close();

        for(int i = 0; i < n; i++){
            if(i % 4 == 0){
                System.out.println("long");
            } 
        }
        System.out.println("int");
    }
}
