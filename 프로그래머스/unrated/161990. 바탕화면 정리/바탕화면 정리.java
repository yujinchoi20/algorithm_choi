class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = new int[4];
        String[][] location = new String[wallpaper.length][wallpaper[0].length()];
        
        int minX = Integer.MAX_VALUE, minY = Integer.MAX_VALUE;
        int maxX = Integer.MIN_VALUE, maxY = Integer.MIN_VALUE;
        
        for(int i = 0; i < location.length; i++) {
            location[i] = wallpaper[i].split("");
        }
        
        for(int i = 0; i < location.length; i++) {
            for(int j = 0; j < location[i].length; j++) {
                if(location[i][j].equals("#")) {
                    if(minX > i) minX = i;
                    if(minY > j) minY = j;
                    if(maxX < i) maxX = i;
                    if(maxY < j) maxY = j;
                }
            }
        }
        
        answer[0] = minX; answer[1] = minY;
        answer[2] = maxX+1; answer[3] = maxY+1;
        
        return answer;
    }
}