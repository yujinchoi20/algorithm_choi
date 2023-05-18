import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> solution(int n, int k) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        for(int i = 0; i <= n; i+=k) {
            if (i != 0) answer.add(i);
        }
        
        return answer;
    }
}