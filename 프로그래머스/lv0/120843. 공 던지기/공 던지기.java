class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int n = 1;
        int idx = 0;
        
        while(n < k) {
            idx += 2;
            
            if(idx >= numbers.length) {
                idx -= (numbers.length);
            }
            
            n++;
            System.out.println("num: " + numbers[idx]);
            System.out.println(n);
        }
        
        answer = numbers[idx];
        
        return answer;
    }
}