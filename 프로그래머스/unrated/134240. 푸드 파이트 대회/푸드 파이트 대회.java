class Solution {
    public String solution(int[] food) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        
        for(int i = 1; i < food.length; i++) {
            for(int j = 0; j < food[i]/2; j++) {
                sb.append(Integer.toString(i));     
            }
        }
        
        answer += sb.toString();
        answer += "0";
        sb.reverse();
        answer += sb.toString();
        
        return answer;
    }
}