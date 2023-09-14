import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> playersMap = new HashMap<>();
        
        for(int i = 0; i < players.length; i++) {
            playersMap.put(players[i], i);
        }
        
        for(String person : callings) {
            int idx = playersMap.get(person);
            String p = players[idx-1];
            
            swap(players, idx-1, idx);
            
            playersMap.put(person, idx-1);
            playersMap.put(p, idx);
        }
        
        return players;
    }
    
    public String[] swap(String[] players, int a, int b) {
        String tmp = players[a];
        players[a] = players[b];
        players[b] = tmp;
        
        return players;
    }
}