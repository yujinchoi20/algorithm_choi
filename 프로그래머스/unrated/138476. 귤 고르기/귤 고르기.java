import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int cnt = 0;
        
        for(int size : tangerine) {
            map.put(size, map.getOrDefault(size, 0) + 1);   
        }
        
        List<Integer> list = new ArrayList<>(map.keySet());
        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer i1, Integer i2) {
                return map.get(i1).compareTo(map.get(i2));
            }
        });
        
        list.sort((i1, i2) -> map.get(i2).compareTo(map.get(i1))); 
        
        for(Integer key : list) {
            if(cnt < k) {
                cnt += map.get(key);
                answer += 1;
            } else {
                break;
            }
        }
        
        return answer;
    }
}