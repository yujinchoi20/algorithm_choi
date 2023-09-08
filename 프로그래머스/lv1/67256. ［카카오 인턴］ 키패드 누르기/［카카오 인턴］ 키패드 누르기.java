class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int[][] num = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {-1, 0, -1}}; //키패드
        
        //왼손, 오른손의 현재 위치를 기억하는 변수
        int lx = 3, ly = 0; //*
        int rx = 3, ry = 2; //#
        
        //1, 4, 7 => 왼손 / 3, 6, 9 => 오른손
        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) {
                answer += "L";
                lx = numbers[i]/3; ly = 0;
            } else if(numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9) {
                answer += "R";
                rx = numbers[i]/3-1; ry = 2;
            } else { //2, 5, 8, 0
                int x = -1, y = -1;
                
                if(numbers[i] == 0) {
                    x = 3; y = 1;
                } else {
                    x = numbers[i]/3; y = 1;
                }
                
                int sumL = Math.abs(lx-x) + Math.abs(ly-y);
                int sumR = Math.abs(rx-x) + Math.abs(ry-y);

                if(sumL < sumR) {
                    answer += "L";
                    lx = x; ly = y;
                } else if(sumL > sumR) {
                    answer += "R";
                    rx = x; ry = y;
                } else {
                    if(hand.equals("right")) {
                        answer += "R";
                        rx = x; ry = y;
                    } else {
                        answer += "L";
                        lx = x; ly = y;
                    }
                }
            }
        }
        
        return answer;
    }
}