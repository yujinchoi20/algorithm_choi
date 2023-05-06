class Solution {
    public int solution(int[] num_list) {
        int even = 0;
        int odd = 0;
        int sum = 0;
        
        for(int i = 0; i < num_list.length; i++) {
            if(num_list[i] % 2 != 0) {
                odd *= 10;
                odd += num_list[i];
            } else {
                even *= 10;
                even += num_list[i];
            }
        }
        
        sum = odd + even;
        
        return sum;
    }
}