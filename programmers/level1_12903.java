// 가운데 글자 가져오기

class level1_12903 {
    public String solution(String s) {
        String answer = s.substring((s.length()-1)/2, s.length()/2 + 1);
        return answer;
    }
}