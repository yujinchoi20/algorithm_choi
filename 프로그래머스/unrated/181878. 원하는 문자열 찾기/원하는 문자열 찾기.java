class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        
        String upMyString = myString.toUpperCase();
        String upPat = pat.toUpperCase();
        
        if(upMyString.contains(upPat)) {
            answer = 1;
        }
        return answer;
    }
}