import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        int len = numbers.length;
        
        return numbers[len-2] * numbers[len-1];
    }
}