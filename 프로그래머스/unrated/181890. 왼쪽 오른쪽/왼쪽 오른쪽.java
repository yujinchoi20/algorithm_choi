import java.util.ArrayList;

class Solution {
    public ArrayList<String> solution(String[] str_list) {
        ArrayList<String> answer = new ArrayList<>();
        boolean flag = true; //left, false = right
        int idx = -1;
        
        for(int i = 0; i < str_list.length; i++) {
            if(str_list[i].equals("l")) {
                idx = i;
                break;
            } 
            if(str_list[i].equals("r")) {
                flag = false;
                idx = i;
                break;
            }
        }
        
        if(flag) { //left
            for(int i = 0; i < idx; i++) {
                answer.add(str_list[i]);
            }
        } else {
            for(int i = idx+1; i < str_list.length; i++) {
                answer.add(str_list[i]);
            }
        }
        return answer;
    }
}