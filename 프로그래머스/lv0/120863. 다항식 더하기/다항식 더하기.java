class Solution {
    public String solution(String polynomial) {
        String answer = "";
        String[] arr = polynomial.split(" ");
        int nx = 0, n = 0;
        
        for(int i = 0; i < arr.length; i += 2) {
            if(arr[i].contains("x")) {
                if(arr[i].length() > 1) {
                    String s = arr[i].replace("x", "");
                    nx += Integer.parseInt(s);
                } else {
                    nx += 1;
                }
            } else {
                n += Integer.parseInt(arr[i]);
            }
        }
        
        if(nx > 0) {
            if(nx > 1) {
                answer = nx + "x"; 
            } else {
                answer = "x";
            }
        } 
        
        if(n > 0) {
            if(nx > 0) {
                answer += " + ";
                answer += n + "";
            } else {
                answer = n + "";
            }
        }
        
        return answer;
    }
}