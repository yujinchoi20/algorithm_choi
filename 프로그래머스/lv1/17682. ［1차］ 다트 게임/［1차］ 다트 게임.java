class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        int[] num = new int[3];
        int idx = 0, n = 0;
        String dartNum = "";
        
        for(int i = 0; i < dartResult.length(); i++) {
            char c = dartResult.charAt(i);
            if(c >= '0' && c <= '9') { //숫자
                dartNum += String.valueOf(c);
            } else if(c == 'S' || c == 'D' || c == 'T') { //보너스
                n = Integer.parseInt(dartNum);
                if(c == 'S') {
                    num[idx] = (int)Math.pow(n, 1);
                    idx++;
                } else if(c == 'D') {
                    num[idx] = (int)Math.pow(n, 2);
                    idx++;
                } else if(c == 'T') {
                    num[idx] = (int)Math.pow(n, 3);
                    idx++;
                }
                dartNum = "";
            } else { //옵션
                if(c == '*') {
                    num[idx-1] *= 2;
                    if(idx >= 2) {
                        num[idx-2] *= 2;
                    }
                } else {
                    num[idx-1] *= (-1);
                }
            }
        }
        
        for(int i = 0; i < num.length; i++) {
            answer += num[i];
        }
        
        return answer;
    }
}