class Solution {
    public int solution(int[] number) {
        int answer = 0;
        
        for(int i = 0; i < number.length - 2; i++) {
            for(int j = i+1; j < number.length - 1; j++) {
                for(int k = j+1; k < number.length; k++) {
                    int n = number[i] + number[j] + number[k];
                    if(n == 0) {
                        answer++;
                    }
                }
            }
        }
        
        return answer;
    }
}