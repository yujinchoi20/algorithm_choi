import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> answer = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        
        for(int i = 0; i < progresses.length; i++) {
            int cnt = 0;
            while(progresses[i] < 100) {
                cnt += 1;
                progresses[i] += speeds[i];
            }    
            queue.add(cnt);
        }
        
        while(!queue.isEmpty()) {
            int cnt = 1; 
            int num = queue.remove();
            
            while(queue.size() > 0 && queue.peek() <= num) {
                cnt++;
                queue.remove();
            }
            
            answer.add(cnt);            
        }
        
        return answer;
    }
}