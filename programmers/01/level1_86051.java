
// 없는 숫자 더하기
class level1_86051 {
    public int solution(int[] numbers) {
        int answer = 45; // 1부터 9까지 ++

        for(int i : numbers){
            answer -= i;
        }

        return answer;
    }
}