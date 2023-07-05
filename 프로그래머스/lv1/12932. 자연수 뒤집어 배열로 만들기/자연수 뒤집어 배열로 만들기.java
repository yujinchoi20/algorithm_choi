class Solution {
    public int[] solution(long n) {
        String str = "" + n;
        int len = str.length();
        int[] answer = new int[len];
        
        int idx = 0;
        while(n > 0) {
            answer[idx] = (int)(n % 10);
            n /= 10;
            idx++;
        }
        
        return answer;
    }
}