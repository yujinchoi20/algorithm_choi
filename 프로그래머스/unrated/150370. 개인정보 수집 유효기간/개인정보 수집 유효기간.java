import java.util.*;

class Solution {
    public ArrayList<Integer> solution(String today, String[] terms, String[] privacies) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        int y = Integer.parseInt(today.substring(0, 4));
        int m = Integer.parseInt(today.substring(5, 7));
        int d = Integer.parseInt(today.substring(8, 10));
        int day = (y*28*12)+(m*28)+d;
        
        HashMap<String, Integer> map = new HashMap<>(); //term
        for(String t : terms) {
            String[] arr = t.split(" ");
            map.put(arr[0], Integer.parseInt(arr[1]));   
        }
        for(int i = 0; i < privacies.length; i++){
            String[] arr = privacies[i].split(" ");
            int plus = map.get(arr[1]);
            int dayPlus = 0;
            
            y = Integer.parseInt(arr[0].substring(0, 4));
            m = Integer.parseInt(arr[0].substring(5, 7)) + plus;
            d = Integer.parseInt(arr[0].substring(8, 10));
            
            if(m > 12) {
                y += (m/12);
                m = m % 12;
            }
            dayPlus = (y*28*12) + (m*28) + d;
            
            if(day >= dayPlus) {
                answer.add(i+1);
            }
        }
        
        return answer;
    }
}