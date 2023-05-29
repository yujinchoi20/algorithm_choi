class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String[] cal = binomial.split(" ");
        
        int first = Integer.parseInt(cal[0]);
        int end = Integer.parseInt(cal[2]);
        
        if(cal[1].equals("+")){
            answer = first + end;
        } else if(cal[1].equals("-")) {
            answer = first - end;
        } else if(cal[1].equals("*")) {
            answer = first * end;
        } 
        
        return answer;
    }
}