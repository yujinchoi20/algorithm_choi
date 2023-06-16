class Solution {
    public String solution(int age) {
        String answer = "";
        String str = Integer.toString(age);
        String[] arr = str.split("");
        
        for(int i = 0; i < arr.length; i++) {
            answer += String.valueOf((char)(Integer.parseInt(arr[i])+97));
        }
        
        return answer;
    }
}