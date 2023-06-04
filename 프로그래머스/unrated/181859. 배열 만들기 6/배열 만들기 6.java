import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> solution(int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i = 0; i < arr.length; i++) {
            if(answer.size() == 0) {
                answer.add(arr[i]);
            } else if(answer.get(answer.size() - 1) == arr[i]) {
                answer.remove(answer.size() - 1);
            } else if(answer.get(answer.size() - 1) != arr[i]) {
                answer.add(arr[i]);
            }
        }
        
        if(answer.size() == 0) answer.add(-1);
        
        return answer;
    }
}