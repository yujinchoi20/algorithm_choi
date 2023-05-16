import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int[] arr = {a, b, c, d};
        Arrays.sort(arr);
        for(int i = 0; i < 4; i++){
            System.out.print(arr[i]);
        }
        
        int answer = 0; 
        
        if(arr[0] == arr[3]) //모두 같을 경우
            answer = 1111 * arr[0]; 
        
        else if(arr[0] == arr[2]) //3개 같을 경우1
            answer = (int)Math.pow(10 * arr[0] + arr[3], 2);
        else if(arr[1] == arr[3]) //3개 같을 경우2
            answer = (int)Math.pow(10 * arr[1] + arr[0], 2);
        
        else if(arr[0] == arr[1] && arr[2] == arr[3]) //2개씩 같을 경우
            answer = (arr[0] + arr[2]) * Math.abs(arr[0] - arr[2]);
        
        else if(arr[0] == arr[1]) 
            answer = arr[2] * arr[3];
        else if(arr[1] == arr[2]) 
            answer = arr[0] * arr[3];
        else if(arr[2] == arr[3]) 
            answer = arr[0] * arr[1];
        
        else //모두 다를 경우 
            answer = arr[0];
        
        return answer;
    }
}