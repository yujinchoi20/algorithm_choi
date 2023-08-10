class Solution {
    static int[] arr;
    public int solution(int number, int limit, int power) {
        int answer = 0;
        arr = new int[number+1];
        
        for(int i = 1; i <= number; i++) {    
            primeCnt(i);
            
            if(arr[i] > limit) {
                arr[i] = power;
            }
            
            answer += arr[i];
        }
        
        return answer;
    }
    
    public void primeCnt(int num) {        
        int cnt = 1;
        
        if(num == 1) {
            arr[num] = cnt;
        } else{
            for(int i = 1; i <= num/2; i++) {
                if(num % i == 0) {
                    cnt++;
                }
            }
        }
        
        arr[num] = cnt;
    }
}