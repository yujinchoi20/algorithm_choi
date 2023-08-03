class Solution {
    public String solution(int a, int b) {
        int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] date = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        int day = b + 5;
        
        for(int i = 0; i < a-1; i++) {
            day += month[i];
        }
        day %= 7;
        
        if(day == 0) {
            day = 7;
        }
        
        return date[day-1];
    }
}