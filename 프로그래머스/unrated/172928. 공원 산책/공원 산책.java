class Solution {
    static int sx = 0, sy = 0;
    static int tx = 0, ty = 0;
    
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];
        String[][] parkArr = new String[park.length][park[0].length()];
        
        //범위
        tx = park.length; ty = park[0].length();
        
        //경로 저장
        for(int i = 0; i < parkArr.length; i++) {
            String[] s = park[i].split("");
            for(int j = 0; j < parkArr[i].length; j++) {
                parkArr[i][j] = s[j];
                
                if(s[j].equals("S")) {
                    sx = i; sy = j;
                }
            }
        }
        
        //위치 이동 -> 장애물 체크 필요함.
        for(String str : routes) {
            String[] arr = str.split(" ");
            
            String ro = arr[0];
            int can = Integer.parseInt(arr[1]);
            
            int nx = sx;
            int ny = sy;
            
            for(int i = 0; i < can; i++) {
                if(ro.equals("E")) {
                    ny++;
                }
                if(ro.equals("W")) {
                    ny--;
                }
                if(ro.equals("S")) {
                    nx++;
                }
                if(ro.equals("N")) {
                    nx--;
                }
                
                if(chkRange(nx, ny)) {
                    if(parkArr[nx][ny].equals("X")) {
                        break;
                    }
                    if(i == can-1) {
                        sx = nx;
                        sy = ny;
                    }
                }
            }
        }
        
        answer[0] = sx; answer[1] = sy;
        
        return answer;
    }
    
    //범위 체크
    public boolean chkRange(int nx, int ny) {
        return nx >= 0 && ny >= 0 && nx < tx && ny < ty;
    }
}