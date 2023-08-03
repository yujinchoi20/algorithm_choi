import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int l = photo.length;
        int[] answer = new int[l];

        for(int i = 0; i < l; i++){
            List<String> list = new ArrayList<>(Arrays.asList(name));
            
            for(int j = 0; j < photo[i].length; j++) {
                if(list.contains(photo[i][j])) {
                    int idx = list.indexOf(photo[i][j]);
                    answer[i] += yearning[idx];
                }
            }
        }
        
        return answer;
    }
}