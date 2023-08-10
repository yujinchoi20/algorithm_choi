class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int[] nArr = new int[n+1]; //벽 상태
        
        for(int i = 0; i < section.length; i++) {
            nArr[section[i]] = 1;
        }
        
        for(int i = 1; i <= n; i++) {
            if(nArr[i] == 1) { //칠해야 하는 곳
                for(int j = 0; j < m; j++) {
                    if(i+j <= n) {
                        nArr[i+j] = 0; //칠하기 
                    }
                    else{
                        break;
                    } 
                }
                
                answer++; //롤링 횟수
            }
        }
        
        return answer;
    }
}