import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        ArrayList<String> list = new ArrayList<>();
        
        for(int i = 0; i < cities.length; i++) {
            cities[i] = cities[i].toLowerCase();
        }
        
        if(cacheSize == 0) {
            answer = 5 * cities.length;
            return answer;
        }
        
        //가장 오랫동안 참조되지 않은 페이지를 교체 -> LRU
        for(int i = 0; i < cities.length; i++) {
            if(list.size() < cacheSize) { //빈 캐시가 있음
                if(!list.contains(cities[i])) { //miss
                    list.add(cities[i]);
                    answer += 5;
                } else { //hit
                    list.remove(cities[i]); //맨 앞 삭제
                    list.add(cities[i]); //맨 뒤 삽입
                    answer += 1;
                }
            } else { //빈 캐시 없음
                if(!list.contains(cities[i])) { //miss
                    list.remove(0);
                    list.add(cities[i]);
                    answer += 5;
                } else { //hit
                    list.remove(cities[i]); 
                    list.add(cities[i]); 
                    answer += 1;
                }
            }
        }
        
        return answer;
    }
}