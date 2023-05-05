class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        int mul = 1, sum = 0;
        for(int i = 0; i < num_list.length; i++) {
            mul *= num_list[i];
        }
        
        for(int i = 0; i < num_list.length; i++) {
            sum += num_list[i];
        }
        sum *= sum;
        
        if(mul < sum) answer = 1;
        
        return answer;
    }
}