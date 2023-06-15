import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(int i = 0; i < my_string.length(); i++) {
            int n = my_string.charAt(i) - '0';
            
            if(n >= 0 && n <= 9) 
                arr.add(n);
        }
        
        int l = arr.size();
        int[] answer = new int[l];
        
        for(int i = 0; i < l; i++) {
            answer[i] = arr.get(i);
        }
        Arrays.sort(answer);
        
        return answer;
    }
}