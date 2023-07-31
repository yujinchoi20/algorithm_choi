import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        int l = numbers.length;
        
        for(int i = 0; i < l; i++) {
            for(int j = i+1; j < l; j++) {
                int sum = numbers[i] + numbers[j];
                if(!answer.contains(sum)) {
                    answer.add(sum);
                }
            }
        }

        int len = answer.size();
        int[] result = new int[len];
        for(int i = 0; i < len; i++) {
            result[i] = answer.get(i);
        }
        Arrays.sort(result);
        
        return result;
    }
}