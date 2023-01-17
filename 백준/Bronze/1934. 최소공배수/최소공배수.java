import java.io.*;
import java.util.*;

public class Main{
	public static int s(int n1, int n2) {
		if(n2 == 0) return n1;
		else return s(n2, n1 % n2);
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		int a = 0, b = 0;
		while(T-- > 0) {
			st = new StringTokenizer(br.readLine());
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			
			//15 % 6 -> 3
			//6 % 3 -> 0
			//15 * 6 / 3 = 30
			int result = s(a, b);
			System.out.println(a * b / result);
		}
	}
}