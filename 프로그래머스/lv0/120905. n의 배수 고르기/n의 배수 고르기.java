import java.util.Arrays;

class Solution {
    public int[] solution(int n, int[] numlist) {
        return Arrays.stream(numlist).filter(s -> s % n == 0).toArray();
    }
}