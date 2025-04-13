// A/B *double*

import java.util.Scanner;

public class boj_1008 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double A = scan.nextDouble();
        double B = scan.nextDouble();

        if(0<A && B<10){
            System.out.println(A/B);
        }
    }
}
