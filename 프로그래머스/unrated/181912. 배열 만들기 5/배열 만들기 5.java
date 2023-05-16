import java.util.*;

class Solution {
    public ArrayList<Integer> solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> answer = new ArrayList<>();
        int len = intStrs.length;
        
        for(int i = 0; i < len; i++) {
            int re = Integer.parseInt(intStrs[i].substring(s, s+l));
            if(re > k) {
                answer.add(re);
            }
        }
        
        return answer;
    }
}