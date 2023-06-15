class Solution {
    public String solution(String cipher, int code) {
        String[] arr = cipher.split("");
        String answer = "";
        
        for(int i = 0; i < arr.length; i++) {
            if((i+1) % code == 0) answer += arr[i];    
        }
        
        return answer;
    }
}