class Solution {
    public String solution(String myString) {
        String answer = "";
        
        for(int i = 0; i < myString.length(); i++) {
            if(myString.substring(i, i+1).equals("a")){
                answer += "A";
            } else if(myString.substring(i, i+1).equals("A")) {
                answer += "A";
            } else {
                answer += myString.substring(i, i+1).toLowerCase();
            }
        }
        
        return answer;
    }
}