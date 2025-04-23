import java.util.Scanner;

public class boj_9498 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int score = scan.nextInt();

        if (0 <= score && score <= 100){
            if(90 <= score){
                System.out.println("A");
            } else if(80 <= score){
                System.out.println("B");
            } else if(70 <= score){
                System.out.println("C");
            } else if(60 <= score){
                System.out.println("D");
            } else {
                System.out.println("F");
            }
        } else {
            System.out.println("0~100점 사이의 점수를 입력하세요");
        }
        
        scan.close();
    }
}
