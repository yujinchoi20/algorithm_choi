import java.util.Arrays;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        int len = people.length;
        Arrays.sort(people);
        
        int start = 0;
        for(int end = len-1; end >= start; end--) {
            if(people[start] + people[end] <= limit) {
                start++;
            }
            answer++;
        }
        
        return answer;
    }
}