import java.util.ArrayList;

class Solution {
    public ArrayList<String> solution(String myStr) {
        ArrayList<String> answer = new ArrayList<>();
        String tmp = "";
        
        for(int i = 0; i < myStr.length(); i++) {
            if(myStr.charAt(i) == 'a' || myStr.charAt(i) == 'b' || myStr.charAt(i) == 'c') {
                if(tmp != "") {
                    answer.add(tmp);
                    tmp = "";
                } 
            } else {
                tmp += myStr.charAt(i);
            }
        }
        
        if(tmp != "") answer.add(tmp);
        if(answer.size() == 0) answer.add("EMPTY");
        
        return answer;
    }
}