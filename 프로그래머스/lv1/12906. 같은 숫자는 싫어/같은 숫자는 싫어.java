import java.util.*;

public class Solution {
    public ArrayList<Integer> solution(int []arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        int pre = -1;
        for(int i = 0; i < arr.length; i++) {
            if(pre != arr[i]) {
                answer.add(arr[i]);
                pre = arr[i];
            }
        }

        return answer;
    }
}