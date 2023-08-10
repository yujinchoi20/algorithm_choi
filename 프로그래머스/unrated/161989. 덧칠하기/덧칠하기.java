class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int rollerPoint = 0;
        
        for(int i : section) {
            if(rollerPoint <= i) {
                rollerPoint = i + m;
                answer++;
            }
        }
        
        return answer;
    }
}