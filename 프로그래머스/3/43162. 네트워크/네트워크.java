class Solution {
    static boolean[] visited;
    
    public int solution(int n, int[][] computers) {
        int answer = 0;
        visited = new boolean[n];
        
        for(int i = 0; i < n; i++) {
            if(!visited[i]) {
                answer++;
                dfs(computers, i, n);
            }
        }
        
        return answer;
    }
    
    public static void dfs(int[][] computers, int node, int n) {
        visited[node] = true;
        
        for(int i = 0; i < n; i++) {
            if(!visited[i] && computers[node][i] == 1) {
                dfs(computers, i, n);
            }
        }
    }
}