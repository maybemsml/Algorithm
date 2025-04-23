// 문자열 내 p와 y의 개수

class level1_12916 {
    boolean solution(String s) {
        boolean answer = true;
        s = s.toLowerCase();
        int count = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'p') {
                count++;
            }
            if (s.charAt(i) == 'y') {
                count--;
            }
        }
        
        if (count != 0) answer = false;
        return answer;
    }
}