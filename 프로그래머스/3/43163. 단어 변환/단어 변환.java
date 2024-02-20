import java.util.Queue;
import java.util.LinkedList;

class Node {
    String word;
    int level;
    
    public Node(String word, int level) {
        this.word = word;
        this.level = level;
    } 
}

class Solution {
    public int solution(String begin, String target, String[] words) {
        int answer = 0;
        
        Queue<Node> queue = new LinkedList<>();
        boolean[] visited = new boolean[words.length];
        
        queue.add(new Node(begin, 0));
        
        while(!queue.isEmpty()) {
            Node node = queue.poll();
            
            if(node.word.equals(target)) {
                answer = node.level;
                break;
            }
            
            for(int i = 0; i < words.length; i++) {
                int count = cnt(words[i], node.word);
                
                if(count == 1 && !visited[i]) {
                    visited[i] = true;
                    queue.add(new Node(words[i], node.level+1));
                }
            }
        }
        return answer;
    }
    
    public static int cnt(String word, String begin) {
        String[] a = word.split("");
        String[] b = begin.split("");
        int count = 0;
        
        for(int i = 0; i < a.length; i++) {
            if(!a[i].equals(b[i])) {
                count++;
            }
        }
        
        return count;
    }
}