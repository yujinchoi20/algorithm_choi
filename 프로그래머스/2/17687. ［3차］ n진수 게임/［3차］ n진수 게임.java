class Solution {
    public String solution(int n, int t, int m, int p) {
        String answer = "";
        String str = "";
        
        for(int i = 0; i < t*m; i++) { //게임 전체 숫자 구하기
            str += Integer.toString(i, n);
        }
        
        for(int i = p-1; i < t*m; i += m){ //튜브가 말하는 숫자 구하기
            answer += Character.toString(str.charAt(i));
        }
        answer = answer.toUpperCase();
        
        return answer;
    }
}