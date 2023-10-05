class Solution {
    public long solution(int n) {
        long answer = 0;
        //n 1 2 3 4 5
        //  1 2 3 5 8 => DP?
        
        int[] arr = new int[2001];
        arr[1] = 1; arr[2] = 2;
        
        for(int i = 3; i <= n; i++) {
            arr[i] = (arr[i-1] + arr[i-2]) % 1234567;
        }
        
        answer = (long)arr[n];
        
        return answer;
    }
}