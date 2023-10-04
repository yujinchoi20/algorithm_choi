class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int gcd = arr[0];
        
        for(int i = 1; i < arr.length; i++) {
            int a = gcd;
            int b = arr[i];
            
            while(b != 0) { //최대공약수
                int tmp = b;
                b = a % b;
                a = tmp;
            }
            
            gcd = (gcd * arr[i] / a); //최소공배수
        }
        
        answer = gcd;
        return answer;
    }
}