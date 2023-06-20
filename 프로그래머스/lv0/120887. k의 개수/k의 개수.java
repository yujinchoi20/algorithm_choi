class Solution {
    public int solution(int a, int b, int k) {
        String str = "";
        for(int i = a; i <= b; i++) {
            str += i+"";
        }      
         
        return str.length() - str.replaceAll(k+"", "").length();
    }
}