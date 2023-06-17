import java.util.*;

class Solution {
    public String solution(String letter) {
        String answer = "";
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        Map<String, String> map = new HashMap<>();
        for(int i = 0; i < 26; i++) {
            map.put(morse[i], String.valueOf((char)(i+97)));
        }
        
        String[] arr = letter.split(" ");
        for(int i = 0; i < arr.length; i++) {
            answer += map.get(arr[i]);    
        }
        
        return answer;
    }
}