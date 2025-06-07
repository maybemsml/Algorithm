import java.util.*;
import java.util.StringTokenizer;

public class boj_2501 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringTokenizer str = new StringTokenizer(scan.nextLine());
        int N = Integer.parseInt(str.nextToken());
        int K = Integer.parseInt(str.nextToken());

        List<Integer> divisors = new ArrayList<>();

        for (int i = 1; i * i <= N; ++i) {
            if (N % i == 0) {
                divisors.add(i);
                if (i != N / i) {
                    divisors.add(N / i);
                }
            }
        }

        Collections.sort(divisors);

        if (K <= divisors.size()) {
            System.out.println(divisors.get(K - 1));
        } else {
            System.out.println(0);
        }

        scan.close();
    }
}
