class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        String strA = A;
        
        for(int i = 0; i < A.length(); i++) {
            if(strA.equals(B)) {
                return answer;
            }
            
            String t = strA.substring(strA.length() - 1);
            strA = t + strA.substring(0, strA.length() - 1);
            answer++;
        }
        
        return -1;
    }
}