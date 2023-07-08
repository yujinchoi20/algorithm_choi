class Solution {
    public long solution(int price, int money, int count) {
        long m = 0;
        
        for(int i = 1; i <= count; i++) {
            m += price * i;
        }
        
        return m < money ? 0 : m - money;
    }
}