class Solution {
    public String[] solution(String[] picture, int k) {
        int len = picture.length;
        String[] answer = new String[len*k];
        
        for(int i = 0; i < len*k; i++) {
            answer[i] = "";
        }
        
        for(int i = 0; i < len*k; i++) {
            for(int j = 0; j < picture[i/k].length(); j++) {
                for(int z = 0; z < k; z++) {
                    answer[i] += picture[i/k].charAt(j);
                }
            }
        }
        
        return answer;
    }
}