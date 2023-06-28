class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        float[] arr = new float[score.length];
        int len = score.length;
        
        for(int i = 0; i < len; i++) {
            arr[i] = (float)((score[i][0] + score[i][1]) / 2.0);
        }
        
        for(int i = 0; i < len; i++) {
            int cnt = 1;
            for(int j = 0; j < len; j++) {
                if(arr[i] < arr[j]) cnt++;
            }
            answer[i] = cnt;
        }
        
        return answer;
    }
}