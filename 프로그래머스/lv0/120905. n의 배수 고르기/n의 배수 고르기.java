import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> solution(int n, int[] numlist) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        for(int i = 0; i < numlist.length; i++) {
            if(numlist[i] % n == 0) 
                answer.add(numlist[i]);
        }
        
        return answer;
    }
}