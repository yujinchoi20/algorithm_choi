import java.util.ArrayList;

class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        
        String str = Integer.toString(n, k); //10진수 n을 k진수로 변환
        String[] arr = str.split("0"); //0을 기준으로 분할
        ArrayList<Long> list = new ArrayList<>(); 
        
        for(int i = 0; i < arr.length; i++) {
            if(!arr[i].equals("")) {
                list.add(Long.parseLong(arr[i]));
            }
        }
        
        for(int i = 0; i < list.size(); i++) {
            if(prime(list.get(i))) {
                answer++;
            }
        }
        
        return answer;
    }
    
    public static boolean prime(Long num) {
        if(num == 1) {
            return false;
        }
        
        for(int i = 2; i <= Math.sqrt(num); i++) {
            if(num % i == 0) {
                return false;
            }
        }
        
        return true;
    }
}