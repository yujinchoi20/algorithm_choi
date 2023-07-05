class Solution {
    public int[] solution(long n) {
        String str = Long.toString(n);
        String[] arr = str.split("");
        
        int len = arr.length;
        int[] answer = new int[len];
        
        for(int i = 0; i < len; i++) {
            answer[i] = Integer.parseInt(arr[len-i-1]);    
        }
        
        return answer;
    }
}