import java.util.Scanner;

public class boj_5597 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int students[] = new int[30];
        
        for(int i=0; i<28; i++){
            int n = scan.nextInt();
            students[n-1]=1;
        }
        scan.close();
		for (int i = 0 ; i < students.length ; i++){
			if (students[i] != 1) {
				System.out.println(i+1);
			}
		}
    }
}
