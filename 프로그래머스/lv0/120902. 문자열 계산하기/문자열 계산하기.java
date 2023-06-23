class Solution {
    public int solution(String my_string) {
        String[] arr = my_string.split(" ");
        int answer = 0;
        
        //짝수에는 숫자, 홀수에는 연산자
        for(int i = 1; i < arr.length; i+=2) {
            if(arr[i].equals("+")) {
                arr[i+1] = Integer.toString(Integer.parseInt(arr[i-1]) + Integer.parseInt(arr[i+1]));
            } else {
                arr[i+1] = Integer.toString(Integer.parseInt(arr[i-1]) - Integer.parseInt(arr[i+1]));
            }
        }
        
        answer = Integer.parseInt(arr[arr.length - 1]);
        
        return answer;
    }
}