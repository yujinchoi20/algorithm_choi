import java.util.Arrays;

class Solution {
    public int[] solution(int[] numlist, int n) {
        int len = numlist.length;
        int[] answer = new int[len];
        double[] tmp = new double[len];
        
        for(int i = 0; i < len; i++) {
            if(numlist[i] - n >= 0) {
                tmp[i] = numlist[i] - n;
            } else {
                tmp[i] = Math.abs(numlist[i] - n) + 0.1;
            }
        }
        
        Arrays.sort(tmp);
        
        for(int i = 0; i < len; i++) {
            if(tmp[i] % 1 == 0) {
                answer[i] = (int)tmp[i] + n;
            } else {
                answer[i] = n - (int)tmp[i];
            }
        }
        
        return answer;
    }
}