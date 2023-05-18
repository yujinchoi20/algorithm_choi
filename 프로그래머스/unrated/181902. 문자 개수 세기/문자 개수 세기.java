class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52]; 
        //65~90 대문자, 97~122 소문자
        //0~25       , 26~51
        //c - 65     , c - 71
        
        for(int i = 0; i < my_string.length(); i++){
            int idx = my_string.charAt(i);
            if(idx <= 90) { //대문자
                idx -= 65;
            } else { //소문자
                idx -= 71;
            }
            
            answer[idx]++;
        }
        return answer;
    }
}