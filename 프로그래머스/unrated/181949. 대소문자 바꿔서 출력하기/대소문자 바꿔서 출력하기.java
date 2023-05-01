import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        for(int i = 0; i < a.length(); i++){
            int num = (int)a.charAt(i);
            if(num >= 65 && num <= 90) {
                System.out.print((char)(num+32));
            } else {
                System.out.print((char)(num-32));
            }
        }
    }
}