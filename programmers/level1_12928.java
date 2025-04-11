// 약수의 합

class level1_12928 {
    public int solution(int n) {
                int sum = 0;
        
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) { 
                sum += i;
            }
        }
        
        return sum;
    }
    
    public static void main(String[] args) {
        level1_12928 sol = new level1_12928();
        System.out.println(sol.solution(12)); 
        System.out.println(sol.solution(5));  
    }
}