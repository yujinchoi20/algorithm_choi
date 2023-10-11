class Solution {
    public int[] solution(int n, long left, long right) {
        int len = (int)(right - left) + 1;
        int[] answer = new int[len];
        
        for(long l = left; l <= right; l++) {
            int i = (int)(l/n);
            int j = (int)(l%n);
            answer[(int)(l-left)] = Math.max(i, j) + 1;
        }   
        
        return answer;
    }
}