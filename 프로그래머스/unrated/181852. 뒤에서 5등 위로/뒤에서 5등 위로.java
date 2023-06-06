import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer;
        answer = Arrays.stream(num_list).sorted().skip(5).toArray();
        return answer;
    }
}