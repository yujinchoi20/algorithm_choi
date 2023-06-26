class Solution {
    public int solution(int chicken) {
        int answer = 0; //결과값
        int r = 0; //나머지 쿠폰
        int n = chicken; //쿠폰
        
        while(n + r >= 10) {
            int a = (n + r) / 10; //쿠폰 생성
            int b = (n + r) % 10; //나머지 저장
            
            n = a;
            r = b;
            answer += n; //쿠폰 누적
        }
        
        return answer;
    }
}