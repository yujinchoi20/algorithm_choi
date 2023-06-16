import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        String[] arr = my_string.toLowerCase().split("");
        Arrays.sort(arr);
        
        String answer = "";
        for(int i = 0; i < arr.length; i++) {
            answer += arr[i];    
        }
        
        return answer;
    }
}