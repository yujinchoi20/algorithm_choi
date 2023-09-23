class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int cnt = 0; //이진 변환 횟수
        int zero = 0; //제거된 0의 개수
        int one = 0; //0 제거 후 길이
        
        while(!s.equals("1")) {
            String[] str = s.split("");
            
            for(String ss : str) {
                if(ss.equals("0")) zero++;
                else one++;
            }
            
            s = Integer.toBinaryString(one).toString();
            one = 0;
            cnt++;
        }
        
        answer[0] = cnt;
        answer[1] = zero;
        
        return answer;
    }
}