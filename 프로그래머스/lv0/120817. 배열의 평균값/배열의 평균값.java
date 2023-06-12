class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        int len = numbers.length;
        int range = len / 2;
        
        if(len % 2 == 0) {
            answer = (numbers[range-1] + numbers[range]) / 2.0;
        } else {
            answer = numbers[range] * 1.0;
        }
        
        return answer;
    }
}