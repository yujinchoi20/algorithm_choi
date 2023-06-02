import java.util.ArrayList;

class Solution {
    public ArrayList<String> solution(String myStr) {
        ArrayList<String> answer = new ArrayList<>();
        String tmp = "";
        
        for(int i = 0; i < myStr.length(); i++) {
            char c = myStr.charAt(i);
            if(c == 'a' || 
               c == 'b' || 
               c == 'c') {
                if(tmp != "") {
                    answer.add(tmp);
                    tmp = "";
                } 
            } else {
                tmp += c;
            }
        }
        
        if(tmp != "") answer.add(tmp);
        if(answer.size() == 0) answer.add("EMPTY");
        
        return answer;
    }
}