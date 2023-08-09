import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int[] answers) {
        ArrayList<Integer> answer = new ArrayList<>();
        //1 2 3 4 5 반복
        //2를 시작으로 1 3 4 5 반복
        //3 1 2 4 5 를 2번씩 반복
        
        int[] f = {1, 2, 3, 4, 5}; //5
        int[] s = {2, 1, 2, 3, 2, 4, 2, 5}; //8
        int[] t = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}; //10
        int[] score = new int[3];
        
        for(int i = 0; i < answers.length; i++) {
            if(answers[i] == f[i%5]) score[0]++;
            if(answers[i] == s[i%8]) score[1]++;
            if(answers[i] == t[i%10]) score[2]++;
        }
        
        int maxScore = Math.max(score[0], Math.max(score[1], score[2]));
        
        for(int i = 0; i < 3; i++) {
            if(maxScore == score[i]) answer.add(i+1);
        }
        
        return answer;
    }
}