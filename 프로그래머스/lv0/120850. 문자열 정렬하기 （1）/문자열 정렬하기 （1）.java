import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        my_string = my_string.replaceAll("[a-zA-Z]", "");
        String[] arr = my_string.split("");
        
        Arrays.sort(arr);
        
        int l = arr.length;
        int[] answer = new int[l];
        for(int i = 0; i < l; i++) {
            answer[i] = Integer.parseInt(arr[i]);
        }
        
        return answer;
    }
}