// 핸드폰 번호 가리기
class level1_12948 {
    public String solution(String phone_number) {
        char[] pn = phone_number.toCharArray();
        
        for(int i = 0; i < pn.length - 4; i ++)
            pn[i] = '*';
        
        return String.valueOf(pn);
    }
}