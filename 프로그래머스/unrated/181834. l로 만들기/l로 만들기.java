class Solution {
    public String solution(String myString) {
        String answer = myString.replaceAll("[^l-z]", "l");
        return answer;
    }
}