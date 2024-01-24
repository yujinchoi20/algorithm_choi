import java.util.ArrayList;
import java.util.HashMap;

class Solution {
    public int[] solution(String msg) {
        int[] answer = {};
        int idx = 1; //색인 번호
        ArrayList<Integer> list = new ArrayList<>(); //최종 반환값 저장
        HashMap<String, Integer> map = new HashMap<>(); //색인 번호 저장
        
        //대문자 알파벳 저장
        for(char c = 'A'; c <= 'Z'; c++) { 
            map.put(c+"", idx++);
        }
        
        for(int i = 0; i < msg.length(); i++) {
            int len = 1; 
            while(i + len <= msg.length() && map.containsKey(msg.substring(i, i+len))) {
                //새로 색인 번호로 저장된 문자를 찾는 과정
                len++;
            }
            
            if(i + len > msg.length()) { //탈출 조건
                list.add(map.get(msg.substring(i))); //나머지 문자 색인 번호 추가
                break;
            }
            
            list.add(map.get(msg.substring(i, i + len - 1)));
            map.put(msg.substring(i, i + len), idx++); //새로운 색인 번호 추가 
            
            if(len > 1) {
                i += len - 2;
                //색인 이후 시작점 -> i+len-1, for문에서 1을 더해주기 때문에 -> i + len - 2
            }
        }
        
        answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}