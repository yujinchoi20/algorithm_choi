class Solution {
    public int solution(int n) {
        int answer = 0;
        String s = "";
        
        while(n != 0) {
            int div = n % 3;
            s += Integer.toString(div);
            n /= 3;
        }
        
        answer = Integer.parseInt(s, 3);

        return answer;
    }
}