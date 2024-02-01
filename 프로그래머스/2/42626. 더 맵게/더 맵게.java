import java.util.PriorityQueue;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        int first = 0;
        
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        
        for(int i : scoville) heap.add(i);
        
        first = heap.peek();
        while(first < K && heap.size() > 1) {
            int a = heap.poll();
            int b = heap.poll();
            int newFood = a + (b * 2);
            
            heap.add(newFood);
            first = heap.peek();
            answer++;
        }
        
        if(K > first) return -1;
        
        return answer;
    }
}