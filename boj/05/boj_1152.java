import java.util.Scanner;
import java.util.StringTokenizer;

public class boj_1152 {
    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		
		scan.close();
		
        // StringTokenizer : str을 " "(공백) 기준으로 잘라주는 클래스
		StringTokenizer token = new StringTokenizer(str," ");
		System.out.println(token.countTokens());
		
	}
}
