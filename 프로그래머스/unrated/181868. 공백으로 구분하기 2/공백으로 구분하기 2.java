import java.util.ArrayList;

class Solution {
    public String[] solution(String my_string) { 
        String[] re = my_string.trim().split("[ ]+");
//         ArrayList<String> answer = new ArrayList<>();
        
//         for(int i = 0; i < re.length; i++) {
//             if(!re[i].equals(" ") && !re[i].equals("")){
//                 answer.add(re[i]);
//             }
//         }
        return re;
    }
}