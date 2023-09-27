class Solution {
    public int solution(int n) {
        int[] fibArr = new int[n+1];
        int div = 1234567;
        
        fibArr[0] = 0; fibArr[1] = 1;
        
        for(int i = 2; i <= n; i++) {
            fibArr[i] = (fibArr[i-1] % div) + (fibArr[i-2] % div);
        }
        
        return fibArr[n] % div;
    }
}