class Solution {
    public int solution(String my_string) {
        int answer = 0;
        my_string = my_string.toLowerCase();
        
        for(int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            if(c >= 'a' && c <= 'z') {
                my_string = my_string.replaceAll(my_string.substring(i, i+1), " ");
            }
        }
        
        my_string = my_string.replaceAll("\\s+", " ");
        my_string = "0" + my_string;
        String[] arr = my_string.split(" ");
        
        for(int i = 0; i < arr.length; i++) {
            answer += Integer.parseInt(arr[i]);
        }
        return answer;
    }
}