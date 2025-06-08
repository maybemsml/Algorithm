import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class boj_9506 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
		int n = -1;
		
		while(true){
			n = scan.nextInt();
			if(n == -1) break;
			
			List <Integer> list = new ArrayList<>();
			int sum = 0;
			for(int i = 1; i < n; i++) {
				if(n % i == 0) {
					sum += i;
					list.add(i);
				}
			}
			
			if(sum == n) {
				System.out.print(n + " = ");
				for(int i = 0; i < list.size(); i++) {
					System.out.print(list.get(i));
					if(i + 1 < list.size())
						System.out.print(" + ");
					else
						System.out.println();
				}
			}
			else
				System.out.println(n + " is NOT perfect.");
		}
        scan.close();
    }
}
