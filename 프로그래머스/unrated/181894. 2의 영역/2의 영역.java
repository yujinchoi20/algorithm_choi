import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> solution(int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        ArrayList<Integer> idx = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 2) idx.add(i);
        }
        
        if(idx.size() == 0) {
            answer.add(-1);
        } else if(idx.size() == 1) {
            answer.add(2);
        } else {
            for(int i = idx.get(0); i <= idx.get(idx.size()-1); i++) {
                answer.add(arr[i]);
            }
        }
        
        return answer;
    }
}