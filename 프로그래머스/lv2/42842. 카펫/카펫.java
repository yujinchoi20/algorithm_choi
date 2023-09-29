class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int cnt = brown + yellow;
        
        for(int i = 1; i <= yellow; i++) {
            if(yellow % i == 0) {
                int x = i; 
                int y = yellow / i;
                int num = (x+y) * 2 + 4;
                
                if(num == brown) {
                    answer[0] = Math.max(x, y) + 2;
                    answer[1] = Math.min(x, y) + 2;
                    
                    break;
                }
            }
        }
        
        return answer;
    }
}