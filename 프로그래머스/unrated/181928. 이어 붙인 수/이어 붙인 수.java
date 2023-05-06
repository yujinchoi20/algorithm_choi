class Solution {
    public int solution(int[] num_list) {
        String even = "";
        String odd = "";
        int sum = 0;
        
        for(int i = 0; i < num_list.length; i++) {
            if(num_list[i] % 2 != 0) {
                odd += Integer.toString(num_list[i]);
            } else {
                even += Integer.toString(num_list[i]);
            }
        }
        
        sum = Integer.parseInt(odd) + Integer.parseInt(even);
        
        return sum;
    }
}