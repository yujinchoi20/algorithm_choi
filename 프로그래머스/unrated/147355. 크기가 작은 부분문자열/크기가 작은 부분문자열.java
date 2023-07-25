class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int lenT = t.length();
        int lenP = p.length();
        Long intP = Long.parseLong(p);
        
        for(int i = 0; i <= lenT-lenP; i++) {
            Long tmp = Long.parseLong(t.substring(i, i+lenP));
            
            if(tmp <= intP) {
                answer++;
            }
        }
        
        return answer;
    }
}