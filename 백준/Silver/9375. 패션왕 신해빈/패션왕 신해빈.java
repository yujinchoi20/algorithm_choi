import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		
		while(T-- > 0) {
			HashMap<String, Integer> h = new HashMap<>(); //!!
			String cate; //category
			int N = Integer.parseInt(br.readLine());
			
			while(N-- > 0) {
				st = new StringTokenizer(br.readLine());
				st.nextToken();
				cate = st.nextToken();
				
				if(h.containsKey(cate)) 
					h.put(cate, h.get(cate) + 1); //중복 체크
				else 
					h.put(cate, 1); //새로운 항목
			}
			
			int output = 1;
			for(int val : h.values()) {
				output *= (val + 1);
			}
			
			System.out.println(output - 1); //알몸일 경우를 빼줌
		}
		
	}
}