import java.util.Scanner;

public class boj_2908 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String num1 = scan.next();
        String num2 = scan.next();

        scan.close();

        num1 = new StringBuilder(num1).reverse().toString();
        num2 = new StringBuilder(num2).reverse().toString();

        System.out.println(Math.max(Integer.parseInt(num1), Integer.parseInt(num2)));
    }
}
