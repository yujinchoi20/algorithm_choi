class Solution {
    public int solution(String number) {
        int answer = 0;
        
        String[] str = number.split("");
        int sum = 0;
        
        for(int i = 0; i < number.length(); i++) {
            sum += Integer.parseInt(str[i]);
        }
        
        answer = sum % 9;
        
        return answer;
    }
}