import java.math.BigInteger;

class Solution {
    public String solution(String a, String b) {
        BigInteger b1 = new BigInteger(a);
        BigInteger b2 = new BigInteger(b);
        
        return ""+b1.add(b2);
    }
}