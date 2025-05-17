import java.util.Scanner;

public class boj_10811 {
	 public static void main(String[] args) {		 
		 Scanner scan = new Scanner(System.in);
		 int n = scan.nextInt();
		 int m = scan.nextInt();
		 int count =0;
		 int arr[] = new int[n];
		 
		 for(int i = 0; i<arr.length; i++) {
			 arr[i]=i+1;
		 }
		 
		 for(int i = 0; i<m; i++) {
			 int a = scan.nextInt();
			 int b = scan.nextInt();
			 a=a-1;
			 b=b-1;
			 
			 while(b>a) {
			 count=arr[a];
			 arr[a]=arr[b];
			 arr[b]=count;
			 b--;
			 a++;
			 }
		 }
		 
         scan.close();

		 for(int i = 0; i<arr.length; i++) {
			 System.out.print(arr[i] + " ");
		 }			 
			    }	
	
}