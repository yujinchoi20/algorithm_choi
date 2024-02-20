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
    
    public static void dfs(String[] words, String start, String target, int level) {
		if(start.equals(target)) {
			answer = level;
			return ;
		}
		
		for(int i = 0; i < words.length; i++) {
			if(words[i].equals(start)) {
				continue;
			}
			
			String[] wordArr = words[i].split("");
			String[] startArr = start.split("");
			
			int cnt = 0; //한 번에 한 개의 알파벳만 바꿀 수 있다는 조건
			for(int j = 0; j < wordArr.length; j++) {
				if(!wordArr[j].equals(startArr[j])) {
					cnt++;
				}
			}
			
			if(cnt == 1 && !visited[i]) {
				visited[i] = true;
				dfs(words, words[i], target, level + 1);
				visited[i] = false;
			}
		}
	}
}