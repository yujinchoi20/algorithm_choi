class Solution {
    public int solution(int[] array) {
        int answer = array[0];
        int[] cnt = new int[1001];
        int max = Integer.MIN_VALUE;
        
        for(int i = 0; i < array.length; i++) {
            cnt[array[i]]++;
            
            if(max < cnt[array[i]]) {
                max = cnt[array[i]];
                answer = array[i];
            }
        }
        
        int tmp = 0;
        for(int i = 1; i < 1001; i++) {
            if(max == cnt[i]) {
                tmp++;
            }
        }
        
        if(tmp > 1) {
            return -1;
        }
        
        return answer;
    }
}