class Solution {
    public int[] solution(String[] strlist) {
        int s = strlist.length;
        int[] answer = new int[s];
        
        for(int i = 0; i < s; i++) {
            answer[i] = strlist[i].length();    
        }
        
        return answer;
    }
}