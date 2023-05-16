class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = true;
        boolean a, b;
        
        if(x1 || x2) {
            a = true;
        } else  {
            a = false;
        }
        
        if(x3 || x4) {
            b = true;
        } else {
            b = false;
        }
        
        if(!(a && b))answer = false;
        
        return answer;
    }
}