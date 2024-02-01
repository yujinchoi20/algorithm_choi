import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.Map.Entry;

class Solution {
    public int[] solution(int[] fees, String[] records) {
        //00:00 ~ 23:59
        //입차 기록은 있지만 출차 기록이 없다면 23:59분에 출차한 것으로 간주함
        //((주차 총 시간 - fees[0]) / fees[2]) * fees[3] + fees[1]
        //HashMap<차량 번호, 입차 시간> inTime; String, String
        //HashMap<차량 번호, 주차 시간> parking; String, Integer
        
        int[] answer = {};
        Map<String, Integer> parking = new TreeMap<>(); //차량의 총 주차 시간
        Map<String, String> inTime = new HashMap<>(); //차량의 입차 시간
        
        for(String record : records) {
            String[] info = record.split(" ");
            
            if(info[2].equals("IN")) { //입차
                inTime.put(info[1], info[0]);
            } else if(info[2].equals("OUT")){ //출차
                int inTimeMin = calTime(inTime.get(info[1]));
                int outTimeMin = calTime(info[0]);
                int allTime = outTimeMin - inTimeMin;
                
                if(parking.containsKey(info[1])) {
                    parking.put(info[1], parking.get(info[1]) + allTime);
                } else {
                    parking.put(info[1], allTime);
                }
                
                inTime.remove(info[1]);
            }
        }
        
        if(!inTime.isEmpty()) {
            for(Entry<String, String> entrySet : inTime.entrySet()) {
                int inTimeMin = calTime(entrySet.getValue());
                int outTimeMin = calTime("23:59");
                int allTime = outTimeMin - inTimeMin;
                
                if(parking.containsKey(entrySet.getKey())) {
                    parking.put(entrySet.getKey(), parking.get(entrySet.getKey()) + allTime);
                } else {
                    parking.put(entrySet.getKey(), allTime);
                }
                
                //inTime.remove(entrySet.getKey()); //동시성 문제로 런타임 오류 발생
            }
        }
        
        answer = new int[parking.size()];
        int idx = 0;
        
        for(Entry<String, Integer> entrySet : parking.entrySet()) {
            int time = entrySet.getValue();
            
            if(time <= fees[0]) { //기본 시간만큼 주차한 경우
                answer[idx] = fees[1];
            } else { //초과 시간 계산 
            	answer[idx] = fees[1] + (int) Math.ceil((time - fees[0]) / (double)fees[2]) * fees[3];
            }
            idx++;
        }
        
        return answer;
    }
    
    public static int calTime(String time) { //hh:MM -> MM
        String[] timeArr = time.split(":");
        return (Integer.parseInt(timeArr[0]) * 60) + Integer.parseInt(timeArr[1]);
    }
}