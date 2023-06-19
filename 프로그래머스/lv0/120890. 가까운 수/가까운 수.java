import java.util.Arrays;

class Solution {
    public int solution(int[] array, int n) {
        Arrays.sort(array);
        
        int l = array.length;
        int[] arr = new int[l];
        int minIdx = 0;
        int minValue = n;
        
        for(int i = 0; i < l; i++) {
            arr[i] = Math.abs(array[i] - n);
        }
        
        for(int i = 0; i < l; i++) {
            if(minValue > arr[i]) {
                minValue = arr[i];
                minIdx = i;
            }    
        }
        
        return array[minIdx];
    }
}