class Solution {
    public int solution(String myString, String pat) {        
        String upMyString = myString.toUpperCase();
        String upPat = pat.toUpperCase();
        
        if(upMyString.contains(upPat)) {
            return 1;
        }
        return 0;
    }
}