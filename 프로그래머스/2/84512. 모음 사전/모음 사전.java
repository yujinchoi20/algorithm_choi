import java.util.Map;
import java.util.HashMap;

class Solution {
    static Map<String, Integer> map;
    static String[] alpha = {"A", "E", "I", "O", "U"};
    static int number = 0;
    
    public int solution(String word) {
        int answer = 0;
        map = new HashMap<>();

        dfs("", 0);
        
        answer = map.get(word);
        
        return answer;
    }
    
    public static void dfs(String str, int len) {
        map.put(str, number++);
        
        if(len == 5) {
            return ;
        }
        
        for(int i = 0; i < 5; i++) {
            dfs(str + alpha[i], len + 1);
        }
    }
}