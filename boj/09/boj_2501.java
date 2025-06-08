import java.util.*;

public class boj_2501 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringTokenizer str = new StringTokenizer(scan.nextLine());
        int n = Integer.parseInt(str.nextToken());
        int k = Integer.parseInt(str.nextToken());

        List<Integer> divisors = new ArrayList<>();

        for (int i = 1; i * i <= n; ++i) {
            if (n % i == 0) {
                divisors.add(i);
                if (i != n / i) {
                    divisors.add(n / i);
                }
            }
        }

        Collections.sort(divisors);

        if (k <= divisors.size()) {
            System.out.println(divisors.get(k - 1));
        } else {
            System.out.println(0);
        }

        scan.close();
    }
}
