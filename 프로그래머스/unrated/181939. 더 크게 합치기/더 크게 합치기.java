class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String case1 = Integer.toString(a) + Integer.toString(b);
        String case2 = Integer.toString(b) + Integer.toString(a);
        
        int c1 = Integer.parseInt(case1);
        int c2 = Integer.parseInt(case2);
        
        if(c1 >= c2) answer = c1;
        else answer = c2;
        
        return answer;
    }
}