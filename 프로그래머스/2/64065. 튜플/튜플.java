import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = {};
        List<List<Integer>> lists = new ArrayList<>();
        
        //문자열 쪼개기 start
        s = s.substring(1, s.length()-1);
        String[] groups = s.split("\\},\\{");
        
        for(String group : groups) {
            group = group.replace("{", "").replace("}", "");
            String[] numbers = group.split(",");
            
            List<Integer> list = new ArrayList<>();
            for(String number : numbers) {
                list.add(Integer.parseInt(number));
            }
            
            lists.add(list);
        }
        //end
        
        Collections.sort(lists, (a, b) -> {
            return Integer.compare(a.size(), b.size());
        }); //list 길이에 따라 정렬
        
        //중복 숫자 거르기
        List<Integer> ans = new ArrayList<>();
        for(List<Integer> l : lists) {
            for(int i : l) {
                if(!ans.contains(i))
                    ans.add(i);
            }
        }
        
        answer = new int[ans.size()];
        for(int i = 0; i < ans.size(); i++) {
            answer[i] = ans.get(i);
        }
        
        return answer;
    }
}