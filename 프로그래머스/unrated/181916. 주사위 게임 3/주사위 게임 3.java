import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int[] arr = new int[4];
        arr[0] = a; arr[1] = b; arr[2] = c; arr[3] = d;
        int answer = arr[0];
        
        for(int num : arr) {
            if(num < answer) answer = num;
        }
        
        if(a == b) {
            answer = c * d;
        } else if(a == c) {
            answer = b * d;
        } else if(a == d) {
            answer = c * b;
        } else if(b == c) {
            answer = a * d;
        } else if(b == d) {
            answer = a * c;
        } else if(c == d) {
            answer = a * b;
        }
        
        if(a == b && b == c && c == d) {
            answer = 1111 * a;
        } 
        
        if((a == b && b == c && c != d)) {
            answer = (int)Math.pow(10 * a + d, 2);
        } else if((a == b && b == d && c != d)) {
            answer = (int)Math.pow(10 * a + c, 2);
        } else if((a == c && c == d && c != b)) {
            answer = (int)Math.pow(10 * a + b, 2);
        } else if((d == b && b == c && c != a)) {
            answer = (int)Math.pow(10 * b + a, 2);
        } 
        
        if(a == b && c == d && a != c) {
            answer = (a + c) * Math.abs(a - c);
        } else if(a == c && b == d && a != b) {
            answer = (a + b) * Math.abs(a - b);
        } else if(a == d && c == b && a != b) {
            answer = (a + c) * Math.abs(a - c);
        } 
            
        return answer;
    }
}