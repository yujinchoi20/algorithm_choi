class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for(int i = 0; i < quiz.length; i++) {
            String[] str = quiz[i].split(" ");
            int result = 0;
            
            //홀수 인덱스는 연산자.
            for(int j = 0; j < str.length; j++) {
                if(j % 2 != 0) {
                    if(str[j].equals("+")) {
                        result = Integer.parseInt(str[j-1]) + Integer.parseInt(str[j+1]);
                        str[j+1] = Integer.toString(result);
                    } else if(str[j].equals("-")) {
                        result = Integer.parseInt(str[j-1]) - Integer.parseInt(str[j+1]);
                        str[j+1] = Integer.toString(result);
                    } else if(str[j].equals("=")) {
                        if(str[j-1].equals(str[j+1])) {
                            answer[i] = "O";
                        } else {
                            answer[i] = "X";
                        }
                    }
                } 
            }
        }
        
        return answer;
    }
}