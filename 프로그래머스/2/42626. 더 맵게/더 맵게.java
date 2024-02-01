import java.util.PriorityQueue;

class Solution {
    public int solution(int[] scoville, int K) {
        int count = 0;
        
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        
        for(int i : scoville) heap.add(i);
        
        while(heap.peek() < K && heap.size() > 1) {
            int firstFoodHot = heap.poll();
            int secondFoodHot = heap.poll();
            int newFoodHot = firstFoodHot + (secondFoodHot * 2);
            
            heap.add(newFoodHot);
            count++;
        }
        
        if(heap.size() <= 1 && heap.peek() < K) return -1;
        
        return count;
    }
}