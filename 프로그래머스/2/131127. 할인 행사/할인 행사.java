import java.util.HashMap;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        int cnt = 0;
        HashMap<String, Integer> map = new HashMap<>();
        
        for(int i = 0; i < want.length; i++) {
            map.put(want[i], number[i]);
            cnt += number[i];
        }
        
        for(int i = 0; i <= discount.length-cnt; i++) {
            HashMap<String, Integer> temp = new HashMap<>();

            for(String key : map.keySet()) {
                temp.put(key,map.get(key));
            }
                
            
            boolean flag = true;
            
            for(int j = i; j < i+cnt; j++) {
                String str = discount[j];
                
                if(!temp.containsKey(str)){ //원하는 물건이 없을 경우
                    flag = false;
                    break;
                }
                
                int value = temp.get(str);
                if(value < 1) { //원하는 물건을 모두 구매한 경우
                    flag = false;
                    break;
                }
                
                temp.put(str, value-1); 
            }
            
            if(flag) { //만약 사고자하는 물건을 다 구매하지 못했을 경우
                for(String key : temp.keySet()) {
                    if(temp.get(key) != 0) {
                        flag = false;
                        break;
                    }
                }
            }
            
            if(flag) {
                answer++;
            }
        }
        
        return answer;
    }
}