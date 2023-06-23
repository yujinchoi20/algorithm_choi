class Solution {
    public String[] solution(String my_str, int n) {
        int l = my_str.length();
        int len = l / n;
        if(l % n != 0) len += 1;
        
        String[] answer = new String[len];
        
        for(int i = 0; i < len; i++) {
            int s = i * n;
            int e = 0;
            
            if(s + n < l) {
                e = s + n;
            } else {
                e = l;
            }
            
            answer[i] = my_str.substring(s, e);
        }
        
        return answer;
    }
}