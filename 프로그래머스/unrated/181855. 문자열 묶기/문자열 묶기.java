class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        int[] arr = new int[31]; //strArr 원소의 길이를 저장하는 배열
        
        for(int i = 0; i < strArr.length; i++) {
            int len = strArr[i].length();
            arr[len]++;
        }
        
        for(int i = 1; i <= 30; i++) {
            if(arr[i] > answer) answer = arr[i];
        }
        return answer;
    }
}