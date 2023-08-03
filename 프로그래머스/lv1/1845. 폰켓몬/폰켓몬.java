import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int len = nums.length;
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < nums.length; i++) {
            if(!list.contains(nums[i])) {
                list.add(nums[i]);
            }
        }
        
        if(list.size() >= len/2) {
            answer = len/2;
        } else {
            answer = list.size();
        }
        
        return answer;
    }
}