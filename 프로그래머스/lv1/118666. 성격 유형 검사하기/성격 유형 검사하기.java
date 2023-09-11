import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        HashMap<String, Integer> map = new HashMap<>();
        
        map.put("R", 0);
        map.put("T", 0);
        map.put("C", 0);
        map.put("F", 0);
        map.put("J", 0);
        map.put("M", 0);
        map.put("A", 0);
        map.put("N", 0);
        
        for(int i = 0; i < survey.length; i++) {
            String[] s = survey[i].split("");
            
            if(choices[i] < 4) {
                map.put(s[0], map.getOrDefault(s[0], 0) + 4 - choices[i]);
            } else {
                map.put(s[1], map.getOrDefault(s[1], 0) + choices[i] - 4);
            }
        }
        
        if(map.get("R") >= map.get("T")) {
            answer += "R";
        } else {
            answer += "T";
        }
        
        if(map.get("C") >= map.get("F")) {
            answer += "C";
        } else {
            answer += "F";
        }
        
        if(map.get("J") >= map.get("M")) {
            answer += "J";
        } else {
            answer += "M";
        }
        
        if(map.get("A") >= map.get("N")) {
            answer += "A";
        } else {
            answer += "N";
        }
        
        return answer;
    }
}