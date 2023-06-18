class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int fac = 1;
        for(int i = 2; i <= 10; i++){
            System.out.println(fac);
            if(fac <= n && n < fac * i){
                answer = i-1;
                break;
            } else if(n == fac * i) {
                answer = i;
                break;
            } 
            else {
                fac *= i;
            }
        }
        
        return answer;
    }
}