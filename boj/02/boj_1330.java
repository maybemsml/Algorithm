import java.util.Scanner;

public class boj_1330 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int a = scan.nextInt();
        int b = scan.nextInt();

        if(-10000<=a && b<=10000){
            if(a > b){
                System.out.println(">");
            } else if(a < b){
                System.out.println("<");
            } else {
                System.out.println("==");
            }
        } else {
            System.out.println("범위 error");
        }

        scan.close();
    }
}
