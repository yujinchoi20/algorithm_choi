class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int[] arr = new int[number+1];
        
        for(int i = 1; i <= number; i++) {
            arr[i] = primeCnt(i);
            System.out.print(arr[i] + " ");
            
            if(arr[i] > limit) {
                arr[i] = power;
            }
            
            answer += arr[i];
        }
        
        return answer;
    }
    
    public int primeCnt(int num) {
        if(num == 1) return 1;
        int cnt = 1;
        
        for(int i = 1; i <= num/2; i++) {
            if(num % i == 0) {
                cnt++;
            }
        }
        
        return cnt;
    }
}