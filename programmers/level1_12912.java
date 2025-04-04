// 두 정수 사이의 합

class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        int a = 3;
        int b = 5;

        if (a <= b) {
            for (int i = a; i <= b; i++)
                answer += i;
        } else {
            for (int i = b; i <= a; i++)
                answer += i;
        }

        return answer;
        System.out.printLn(answer);
    }
}