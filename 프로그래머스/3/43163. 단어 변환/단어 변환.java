import java.util.*;

class Solution {
    static boolean[] visited;
	static int answer;
    
    public int solution(String begin, String target, String[] words) {
        visited = new boolean[words.length];		
		List<String> list = Arrays.asList(words);
		
		if(!list.contains(target)) {
			return 0;
		}

		dfs(words, begin, target, 0);
        
        return answer;
    }
    
    public static void dfs(String[] words, String begin, String target, int level) {
		if(begin.equals(target)) { //탈출 조건
			answer = level;
			return ;
		}
		
		for(int i = 0; i < words.length; i++) {
			if(words[i].equals(begin)) {
				continue;
			}
			
			String[] wordArr = change(words[i]);
			String[] beginArr = change(begin);
			
			int count = cnt(words[i], begin);
			
			if(count == 1 && !visited[i]) {
				visited[i] = true;
				dfs(words, words[i], target, level + 1);
				visited[i] = false;
			}
		}
	}
    
    //조건 1 검증
    public static int cnt(String word, String begin) {
        String[] a = change(word);
        String[] b = change(begin);
        int count = 0;
        
        for(int i = 0; i < a.length; i++) {
            if(!a[i].equals(b[i])) {
                count++;
            }
        }
        
        return count;
    }
    
    //String -> String[] 
    public static String[] change(String str) {
        String[] strArr = str.split("");
        return strArr;
    }
}