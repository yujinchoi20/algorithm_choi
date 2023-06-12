class Solution {
    public int solution(int n, int k) {
        int service = n / 10;
        return n * 12000 + k * 2000 - service * 2000;
    }
}