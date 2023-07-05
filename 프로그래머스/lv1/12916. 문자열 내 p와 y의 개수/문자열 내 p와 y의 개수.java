class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        s = s.toLowerCase();
        String[] strArr = s.split("");
        int pNum = 0, yNum = 0;
        
        for(int i = 0; i < strArr.length; i++) {
            if(strArr[i].equals("p")) {
                pNum++;
            }
            else if(strArr[i].equals("y")) {
                yNum++;
            }
        }
        
        if(pNum != yNum) {
            answer = false;
        }
        
        return answer;
    }
}