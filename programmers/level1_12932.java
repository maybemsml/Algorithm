// 자연수 뒤집어 배열로 만들기

class level1_12932 {
    public int[] solution(long n) {
        String str = Long.toString(n);
        String arr[] = str.split("");
        int[] answer = new int[str.length()];
        for(int i=0; i<str.length(); i++)
            answer[i] = Integer.valueOf(arr[str.length()-i-1]);
        return answer;
    }
}
