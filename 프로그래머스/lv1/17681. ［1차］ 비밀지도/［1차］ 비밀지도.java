class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String[][] check = new String[n][n];
        
        for(int i = 0; i < arr1.length; i++) {
            String s1 = Integer.toBinaryString(arr1[i]).toString();
            String s2 = Integer.toBinaryString(arr2[i]).toString();
            
            if(s1.length() < n) {
                int l = s1.length();
                for(int j = 0; j < n-l; j++) {
                    s1 = "0" + s1;
                }
            }
            
            if(s2.length() < n) {
                int l = s2.length();
                
                for(int j = 0; j < n-l; j++) {
                    s2 = "0" + s2;
                }
            }
            
            for(int j = 0; j < n; j++) {
                if(s1.charAt(j) != s2.charAt(j)){
                    check[i][j] = "1";
                } else if(s1.charAt(j) == '1') {
                    check[i][j] = "1";
                } else {
                    check[i][j] = "0";
                }
            }
        }
        
        for(int i = 0; i < n; i++) {
            String s = "";
            
            for(int j = 0; j < n; j++) {
                if(check[i][j].equals("1")){
                    s += "#";
                } else {
                    s += " ";
                }
            }
            
            answer[i] = s;
        }
        return answer;
    }
}