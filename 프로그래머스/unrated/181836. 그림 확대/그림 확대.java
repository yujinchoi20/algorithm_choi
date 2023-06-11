class Solution {
    public String[] solution(String[] picture, int k) {
        StringBuffer sb1 = new StringBuffer();
        StringBuffer sb2 = new StringBuffer();
        
        for(int i = 0; i < k; i++) {
            sb1.append("x");
            sb2.append(".");
        }
        
        String x = sb1.toString();
        String dot = sb2.toString();
        
        int len = picture.length;
        String[] answer = new String[len * k];
        
        int idx = 0;
        for(int i = 0; i < len; i++) {
            String tmp;
            tmp = picture[i].replace(".", dot);
            tmp = tmp.replace("x", x);

            for(int j = 0; j < k; j++) {
                answer[idx++] = tmp;
            }
        }
        
        return answer;
    }
}