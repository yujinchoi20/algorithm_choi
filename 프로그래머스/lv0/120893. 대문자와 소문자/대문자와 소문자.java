class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        for(int i = 0; i < my_string.length(); i++) {
            if(Character.isUpperCase(my_string.charAt(i))) {
                answer += my_string.substring(i, i+1).toLowerCase();
            } else {
                answer += my_string.substring(i, i+1).toUpperCase();
            }
        }
        
        return answer;
    }
}