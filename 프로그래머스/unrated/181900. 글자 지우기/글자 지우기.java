import java.util.Arrays;

class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        boolean flag = true;
        
        for(int i = 0; i < my_string.length(); i++) {
            
            for(int j = 0; j < indices.length; j++) {
                if(i == indices[j]) { //지우기
                    flag = false;
                    break;
                } else { //추가하기
                    flag = true;
                }
            }
            
            if(flag) answer += my_string.charAt(i);
        }
        
        return answer;
    }
}