import java.io.*;
import java.util.*;

public class Main {
	static int A;
	static int P;
	static List<Integer> list; 
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		A = Integer.parseInt(st.nextToken());
		P = Integer.parseInt(st.nextToken());
		
		list = new ArrayList<>();
		list.add(A);
		
		while(true) {
			int tmp = list.get(list.size() - 1);
			int sum = 0;
			
			while(tmp != 0) { //정수의 자릿수를 확정지을 수 없기에 while문 사용 
				sum += (int) Math.pow(tmp%10, (double)P);
				tmp /= 10;
			}
			
			if(list.contains(sum)) {
				int ans = list.indexOf(sum); //중복된 값이 있으면 그 값의 index값을 찾아서 반환
				sb.append(ans).append("\n"); //찾은 인덱스 값이 반복부분을 제외한 수열에 남게되는 수의 개수!
				break; 
			}
			
			list.add(sum);
		}
		
		System.out.println(sb);
	}
}