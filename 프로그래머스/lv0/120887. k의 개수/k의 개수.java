class Solution {
    public int solution(int a, int b, int k) {
        int answer = 0;
        String str = "";
        
        for(int i = a; i <= b; i++) {
            str += Integer.toString(i);    
        }      
    
        String[] arr = str.split("");
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i].equals(Integer.toString(k)))
                answer++;
        }
        
        return answer;
    }
}