class Solution {
    static boolean[] visit;
    static int answer = -1;
    
    public int solution(int k, int[][] dungeons) {
        
        visit = new boolean[dungeons.length];
        dfs(0, k, dungeons);
        
        return answer;
    }
    
    public void dfs(int c, int k, int[][] dungeons) {
        for(int i = 0; i < dungeons.length; i++) {
            if(!visit[i] && dungeons[i][0] <= k) {
                visit[i] = true;
                dfs(c+1, k - dungeons[i][1], dungeons);
                visit[i] = false;
            }
        }
        
        if(answer < c) {
            answer = c;
        }
    }
}