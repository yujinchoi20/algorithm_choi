import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> solution(int[] arr, int[] delete_list) {
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i = 0; i < arr.length; i++) {
            answer.add(arr[i]);
        }
        
        for(int i = 0; i < delete_list.length; i++) {
            for(int j = 0; j < answer.size(); j++) {
                if(answer.get(j) == delete_list[i]) {
                    answer.remove(j);
                }
            }
        }
        return answer;
    }
}