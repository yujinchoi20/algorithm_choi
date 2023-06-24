class Solution {
    public int solution(int balls, int share) {
        return combination(balls, share);
    }
    
    public static int combination(int b, int s) {
        if(b == s || s == 0) 
            return 1;
        
        return combination(b-1, s-1) + combination(b-1, s);
    }
}