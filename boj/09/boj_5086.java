import java.util.Scanner;
 
public class boj_5086 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
 
        while(true){
            int one = scan.nextInt();
            int two = scan.nextInt();
            scan.close();
 
            if(one == 0 && two == 0){
                break;
            } else if (two%one == 0) {
                System.out.println("factor");
            } else if(one%two == 0){
                System.out.println("multiple");
            }
            else{
                System.out.println("neither");
            }
        }
 
    }
}
