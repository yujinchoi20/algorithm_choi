import java.util.HashMap;
import java.util.HashSet;
import java.util.Arrays;
import java.util.ArrayList;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        HashMap<String, Integer> map = new HashMap<>(); //id별 신고 당한 횟수
        HashMap<String, Integer> result = new HashMap<>();
        
        HashSet<String> set = new HashSet<>(Arrays.asList(report)); //한 유저의 중복신고 제외
        String[] reReport = set.toArray(new String[0]);
        ArrayList<String> notice = new ArrayList<>(); //정지 아이디 저장
    
        /////////////////////////////////////////////////////////////////
        
        for(int i = 0; i < id_list.length; i++) {
            map.put(id_list[i], 0);
            result.put(id_list[i], 0);
        }
        
        for(int i = 0; i < reReport.length; i++) { //신고 받은 횟수 저장
            String[] arr = reReport[i].split(" ");
            map.put(arr[1], map.getOrDefault(arr[1], 0) + 1);
        }
        
        for(int i = 0; i < id_list.length; i++) { //정지당한 유저 찾기
            if(map.get(id_list[i]) >= k) {
                notice.add(id_list[i]);
            }
        }
        
        /////////////////////////////////////////////////////////////////
        
        if(notice.size() > 0) { //정지당한 유저가 없다면 그대로 종료
            for(int i = 0; i < reReport.length; i++){
                String[] arr = reReport[i].split(" ");
                
                if(notice.contains(arr[1])) {
                    result.put(arr[0], result.getOrDefault(arr[0], 0) + 1);
                }
            }
        }
        
        for(int i = 0; i < id_list.length; i++) {
            answer[i] = result.get(id_list[i]);
        }
        
        return answer;
    }
}