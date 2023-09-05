import java.util.HashMap;

class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < skip.length(); i++) {
            map.put(skip.charAt(i), 0); //skip할 알파벳 저장
        }
        
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int idx = 0;
            
            while(idx < index) {
                c = (char)((c+1 - 'a') % 26 + 'a'); //skip과 상관 없이 현재 알파벳
                if(map.get(c) != null) {
                    continue; //skip
                }
                idx++; //index count
            }
            
            answer += String.valueOf(c);
        }
        
        return answer;
    }
}