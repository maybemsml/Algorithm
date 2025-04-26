// 순서 논리도 잘 생각하기
import java.util.Scanner;

public class boj_2525 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int hour = scan.nextInt();
        int minute = scan.nextInt();
        int time = scan.nextInt();
        
        minute += time % 60;
        hour += time / 60;
        
        if(minute >= 60){
            hour += 1;
            minute -= 60;
        }

        if(hour >= 24){
            hour -= 24;
        }
        
        
        System.out.println(hour + " " + minute);
        
        scan.close();
    }
}
