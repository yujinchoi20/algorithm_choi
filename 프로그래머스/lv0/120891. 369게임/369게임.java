class Solution {
    public int solution(int order) {
        int answer = 0;
        String str = Integer.toString(order);
        String[] arr = str.split("");
        
        for(int i = 0; i < arr.length; i++) {
            if(Integer.parseInt(arr[i]) == 3
              || Integer.parseInt(arr[i]) == 6
              || Integer.parseInt(arr[i]) == 9) {
                answer++;
            }    
        }
        
        return answer;
    }
}