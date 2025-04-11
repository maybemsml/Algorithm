// 나머지가 1이 되는 수 찾기

class level1_87389 {
    public int solution(int n) {
        int x = 1;
		while (n%x != 1) {
			x++;
		}
        int answer = x;
		return answer;
	}
}