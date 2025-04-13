// 사칙연산

import java.util.Scanner;

public class boj_10869 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int A = scan.nextInt();
        int B = scan.nextInt();
        
        if(1<=A && B<=10000){
            System.out.println(A+B);
            System.out.println(A-B);
            System.out.println(A*B);
            System.out.println(A/B);
            System.out.println(A%B);
        }
    }
}
