import java.util.Arrays;

class Solution {
    public String[] solution(String[] strings, int n) {
        int l = strings.length;
        String[] answer = new String[l];
        String[] str = new String[l];
        
        Arrays.sort(strings);
        
        for(int i = 0; i < l; i++) {
            str[i] = strings[i].substring(n, n+1) + strings[i];
        }
        Arrays.sort(str);
        
        for(int i = 0; i < l; i++) {
            int len = str[i].length();
            answer[i] = str[i].substring(1, len);
        }
        
        return answer;
    }
}