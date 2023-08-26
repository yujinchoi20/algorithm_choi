class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int[] arr = new int[46];
        int cnt_win = 0;
        int cnt_zero = 0;
        
        for(int i = 0; i < win_nums.length; i++) {
            arr[win_nums[i]]++;
        }
        
        for(int i = 0; i < lottos.length; i++) {
            if(arr[lottos[i]] == 1) {
                cnt_win++;
            } 
            if(lottos[i] == 0) {
                cnt_zero++;
            }
        }
        
        if(cnt_win == 0 || cnt_win == 1) {
            answer[1] = 6;
        } else {
            answer[1] = 7 - cnt_win;
        }
        
        if(cnt_zero == 6) {
            answer[0] = 1;
        } else {
            answer[0] = answer[1] - cnt_zero;
        }
        
        return answer;
    }
}