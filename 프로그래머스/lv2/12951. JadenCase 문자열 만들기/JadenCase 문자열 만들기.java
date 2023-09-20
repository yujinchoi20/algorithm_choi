class Solution {
    public String solution(String s) {
        String answer = "";
        s = s.toLowerCase();
        String[] arrStr = s.split(" ");
        
        for(int i = 0; i < arrStr.length; i++) {
            if(arrStr[i].length() == 0) {
                answer += " ";
            } else {
                String str = arrStr[i];
                
                answer += str.substring(0, 1).toUpperCase();
                answer += str.substring(1, str.length()).toLowerCase();
                answer += " ";
            }
        }
        
        if(s.substring(s.length()-1, s.length()).equals(" ")) {
            return answer;
        }
        
        return answer.substring(0, answer.length()-1);
    }
}