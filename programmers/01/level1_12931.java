

import java.util.*;

public class level1_12931 {
    public int solution(int n) {
        int answer = 0;
            
        while(n != 0){
            answer += n%10;
            n /= 10;
        }
        
        return answer;
    }

}

// 타입 변환으로 푸는 방법도 있음