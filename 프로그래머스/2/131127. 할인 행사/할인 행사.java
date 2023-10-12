import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        int cnt = 0; 
        
        for(int i = 0; i < want.length; i++) {
            cnt += number[i];
        }
        
        for(int i = 0; i <= discount.length-cnt; i++) {
            String str = "";
            
            for(int j = i; j < i+cnt; j++) {
                str += discount[j];
            }
            
            for(int j = 0; j < want.length; j++) {
                for(int k = 0; k < number[j]; k++) {
                    str = str.replaceFirst(want[j], "");
                }
            }
            
            if(str.equals("")) {
                answer++;
            }
        }
        
        return answer;
    }
}