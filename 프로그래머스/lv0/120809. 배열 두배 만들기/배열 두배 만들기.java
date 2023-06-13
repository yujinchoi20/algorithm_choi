class Solution {
    public int[] solution(int[] numbers) {
        int n = numbers.length;
        
        for(int i = 0; i < n; i++) {
            numbers[i] *= 2;
        }
        
        return numbers;
    }
}