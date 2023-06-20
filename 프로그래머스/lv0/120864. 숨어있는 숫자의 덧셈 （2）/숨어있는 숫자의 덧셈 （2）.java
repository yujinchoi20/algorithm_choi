class Solution {
    public int solution(String my_string) {
        int answer = 0;
        my_string = my_string.replaceAll("[a-zA-Z]", " ");
        
        my_string = "0" + my_string;
        my_string = my_string.replaceAll("\\s+", " ");
        String[] arr = my_string.split("\\s");
        
        for(int i = 0; i < arr.length; i++) {
            answer += Integer.parseInt(arr[i]);
        }
        
        return answer;
    }
}