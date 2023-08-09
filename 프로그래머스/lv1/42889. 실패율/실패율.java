import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int N, int[] stages) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        int[] stageNum = new int[N+2];
        int[] stageTotal = new int[N+1];
        
        for(int i = 0; i < stages.length; i++) {
            stageNum[stages[i]]++;
        }
        
        stageTotal[0] = stages.length;
        for(int i = 1; i <= N; i++) {
            stageTotal[i] = stageTotal[i-1] - stageNum[i-1];
        }
        
        Map<Integer, Double> map = new HashMap<>();
        for(int i = 1; i <= N; i++) {
            if(stageTotal[i] == 0) {
                map.put(i, 0.0);
                continue;
            }    
            
            double rate = (double) stageNum[i]/stageTotal[i];
            map.put(i, rate);
        }

        List<Integer> list = new ArrayList<>(map.keySet());
        Collections.sort(list, (v1, v2) -> (map.get(v2).compareTo(map.get(v1))));
        for(Integer i : list) {
            answer.add(i);
        }
        
        return answer;
    }
} 