import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine()); //Text Case
		while(T-- > 0) {
			st = new StringTokenizer(br.readLine());
			
			int x1, y1, r1, x2, y2, r2;
			x1 = Integer.parseInt(st.nextToken());
			y1 = Integer.parseInt(st.nextToken());
			r1 = Integer.parseInt(st.nextToken());
			x2 = Integer.parseInt(st.nextToken());
			y2 = Integer.parseInt(st.nextToken());
			r2 = Integer.parseInt(st.nextToken());
			
			//원으로 생각하기!!
			//무한대 -> 두 원의 중심과 반지름의 길이가 같을 경우 즉, 두 원이 겹칠 경우
			//0개 -> 두 원사이에 접점이 없는 경우, 두 원의 중심의 거리가 두 원의 반지름의 합 보다 클 경우
			//	 -> 두 원의 중심의 거리가 두 원의 차 보다 작을 경우
			//1개 -> 외접 혹은 내접
			//2개 -> 그 외 나머지 경우
			System.out.println(distance_Circle(x1, y1, r1, x2, y2, r2));
		}
	}
	
	public static int distance_Circle(int x1, int y1, int r1, int x2, int y2, int r2) {
		int distance = (int)(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		
		//-1
		if(x1 == x2 && y1 == y2 && r1 == r2) {
			return -1;
		}
		
		//0
		else if(distance > Math.pow(r1+r2, 2)) {
			return 0;
		}
		else if(distance < Math.pow(r2-r1, 2)) {
			return 0;
		}
		
		//1
		else if(distance == Math.pow(r1+r2, 2)) {
			return 1;
		}
		else if(distance == Math.pow(r2-r1, 2)) {
			return 1;
		}
		
		//2
		else 
			return 2;
	}
}
