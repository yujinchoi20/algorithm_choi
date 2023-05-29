import java.util.*;

class Solution {
    public String[] solution(String myString) {
        String[] arr = myString.split("x");
        List<String> resultArr = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++) {
            if(!arr[i].equals("")){
                resultArr.add(arr[i]);
            }
        }
        
        String[] answer = new String[resultArr.size()];
        resultArr.toArray(answer);
        Arrays.sort(answer);
        return answer;
    }
}