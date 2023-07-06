import java.util.*;

class Solution {
    public long solution(long n) {
        String str = Long.toString(n);
        String[] arr = str.split("");
        Arrays.sort(arr, Collections.reverseOrder());

        String t = "";
        for(int i = 0; i < arr.length; i++) {
            t += arr[i];
        }
        
        return Long.parseLong(t);
    }
}