import java.util.Arrays;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        
        int len = rank.length;
        int[] arr = new int[len];
        for(int i = 0; i < len; i++) {
            arr[i] = rank[i];
        }
        
        int a = 0, b = 0, c = 0;
        int maxValue = rank[0];
        
        for(int i = 1; i < len; i++) {
            if(rank[i] > maxValue) maxValue = rank[i];
        }
        maxValue+=1;
        
        for(int i = 0; i < len; i++) {
            if(!attendance[i]) rank[i] = maxValue;
        } 
        Arrays.sort(rank); 
        
        for(int i = 0; i < len; i++) {
            if(rank[0] == arr[i]) a = i;
            else if(rank[1] == arr[i]) b = i;
            else if(rank[2] == arr[i]) c = i;
        }
        
        answer = 10000 * a + 100 * b + c;
            
        return answer;
    }
}