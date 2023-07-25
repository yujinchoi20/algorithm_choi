class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] numbers = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i].equals("zero") && s.contains(numbers[i])) {
                s = s.replaceAll(numbers[i], "0");
            } else if(numbers[i].equals("one") && s.contains(numbers[i])) {
                s = s.replaceAll(numbers[i], "1");
            } else if(numbers[i].equals("two") && s.contains(numbers[i])) {
                s = s.replaceAll(numbers[i], "2");
            } else if(numbers[i].equals("three") && s.contains(numbers[i])) {
                s = s.replaceAll(numbers[i], "3");
            } else if(numbers[i].equals("four") && s.contains(numbers[i])) {
                s = s.replaceAll(numbers[i], "4");
            } else if(numbers[i].equals("five") && s.contains(numbers[i])) {
                s = s.replaceAll(numbers[i], "5");
            } else if(numbers[i].equals("six") && s.contains(numbers[i])) {
                s = s.replaceAll(numbers[i], "6");
            } else if(numbers[i].equals("seven") && s.contains(numbers[i])) {
                s = s.replaceAll(numbers[i], "7");
            } else if(numbers[i].equals("eight") && s.contains(numbers[i])) {
                s = s.replaceAll(numbers[i], "8");
            } else {
                s = s.replaceAll(numbers[i], "9");
            }
        }
        
        answer = Integer.parseInt(s);
        
        return answer;
    }
}