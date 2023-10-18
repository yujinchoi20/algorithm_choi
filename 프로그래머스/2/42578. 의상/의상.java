import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        
        for(String[] str : clothes) {
            map.put(str[1], map.getOrDefault(str[1], 0) + 1);
        }
        
        for(String key : map.keySet()) {
            list.add(map.get(key));
        }
        System.out.println(list);
        
        for(int i = 0; i < list.size(); i++) {
            int tmp = list.get(i) + 1;
            answer *= tmp;
        }
        answer -= 1;
        
        /*
            a + b + c + ab + ac + bc + abc
            a: 2, b: 1, c: 1
            a+b+c = 4
            ab = 2, bc = 1, ac = 2
            abc = 2
            11
            
            (a+1)(b+1)(c+1)-1
        */
        
        return answer;
    }
}