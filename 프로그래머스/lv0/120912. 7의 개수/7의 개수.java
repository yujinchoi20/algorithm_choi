class Solution {
    public int solution(int[] array) {
        int answer = 0;
        String s  = "";
        
        for(int i = 0; i < array.length; i++) {
            s += Integer.toString(array[i]);   
        }
        
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '7') {
                answer++;
            }
        }
        
        return answer;
    }
}