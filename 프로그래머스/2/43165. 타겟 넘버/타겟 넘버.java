class Solution {
    static int cnt = 0;
    
    public int solution(int[] numbers, int target) {
        int answer = 0;
        
        dfs(numbers, 0, target, 0);
        answer = cnt;
        
        return answer;
    }
    
    public void dfs(int[] numbers, int d, int target, int re) {
        if(d == numbers.length) {
            if(target == re) {
                cnt++;
            }
            return ;
        }
        
        int plus = re + numbers[d];
        int minus = re - numbers[d];
        
        dfs(numbers, d+1, target, plus);
        dfs(numbers, d+1, target, minus);
    }
}