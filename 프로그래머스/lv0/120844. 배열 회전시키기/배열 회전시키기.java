class Solution {
    public int[] solution(int[] numbers, String direction) {
        int l = numbers.length;
        int[] answer = new int[l];
        
        if(direction.equals("right")){
            for(int i = 1; i < l; i++) {
                answer[i] = numbers[i-1];
            }
            answer[0] = numbers[l-1];
        } else {
            for(int i = 0; i < l-1; i++) {
                answer[i] = numbers[i+1];
            }
            answer[l-1] = numbers[0];
        }

        return answer;
    }
}