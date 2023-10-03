class Solution
{
    public int solution(int N, int A, int B)
    {
        int answer = 0;

        if(N == 2) return 1;
        
        for(int i = 0; i < N/2; i++) { //i는 경기 횟수
            if(A == B) {
                break;
            }
            
            if(A % 2 != 0) A += 1;
            if(B % 2 != 0) B += 1;
            
            A /= 2;
            B /= 2;
            answer++;
            System.out.println("A: " + A + " B: " + B + ", ROUND: " + answer);
        }
        
        return answer;
    }
}