class Solution {
    public String solution(String s) {
        String answer = "";
        String[] numbers = s.split(" ");
        int[] intNumbers = new int[numbers.length];
        
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        for(int i = 0; i < numbers.length; i++) {
            intNumbers[i] = Integer.parseInt(numbers[i]);    
            
            if(intNumbers[i] < min) min = intNumbers[i];
            if(intNumbers[i] > max) max = intNumbers[i];
        }
        
        answer += Integer.toString(min);
        answer += " ";
        answer += Integer.toString(max);
        
        return answer;
    }
}