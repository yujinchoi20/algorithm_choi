class Solution {
    public int solution(String s) {
        int answer = 0;
        int l = 0, r = 0;
        
        String[] arr = s.split("");
        String x = "";
        
        for(String a : arr) {
            if(l == 0 && r == 0) {
                x = a; l++;
            } else {
                if(a.equals(x)) l++;
                else r++;
                
                if(l == r) {
                    x = "";
                    answer++;
                    l = 0; r = 0;
                }
            }
        }
        
        if(l+r != 0) answer++;
        
        return answer;
    }
}