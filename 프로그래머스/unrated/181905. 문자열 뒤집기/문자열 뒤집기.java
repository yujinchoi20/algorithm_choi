class Solution {
    public String solution(String my_string, int s, int e) {     
        StringBuffer answer = new StringBuffer(my_string.substring(s, e+1));
        answer.reverse();
        
        return my_string.substring(0, s) + answer + my_string.substring(e+1);
    }
}