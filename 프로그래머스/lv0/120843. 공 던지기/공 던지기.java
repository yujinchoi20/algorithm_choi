class Solution {
    public int solution(int[] numbers, int k) {
        int idx = ((k-1) * 2) % numbers.length;
        // 1 3 5 1 3
        // 0 2 4 6(0) 8(2)
        return numbers[idx];
    }
}