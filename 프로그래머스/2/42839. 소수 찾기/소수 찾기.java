import java.util.Set;
import java.util.HashSet;

class Solution {
    static boolean[] visited = new boolean[7];
    static Set<Integer> set;
    
    public int solution(String numbers) {
        int answer = 0;
        set = new HashSet<>();
        dfs(numbers, "", 0);
        
        for(Integer i : set) {
            if(prime(i)) {
                answer += 1;
            }
        }
        
        return answer;
    }
    
    public static void dfs(String numbers, String str, int dep) {
        if(dep > numbers.length()) {
            return ;
        }
        
        for(int i = 0; i < numbers.length(); i++) {
            if(!visited[i]) {
                visited[i] = true;
                set.add(Integer.parseInt(str + numbers.charAt(i)));
                dfs(numbers, str + numbers.charAt(i), dep + 1);
                visited[i] = false;
            }
        }
    }
    
    public static boolean prime(int n) {
        if(n == 0 || n == 1) return false;
        if(n == 2) return true;
        
        for(int i = 2; i <= (int)Math.sqrt(n); i++) {
            if(n % i == 0) return false;
        }
        
        return true;
    }
}