import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		
		while(T-- > 0) {
			st = new StringTokenizer(br.readLine());
			
			int sx, sy, ex, ey;
			sx = Integer.parseInt(st.nextToken());
			sy = Integer.parseInt(st.nextToken());
			ex = Integer.parseInt(st.nextToken());
			ey = Integer.parseInt(st.nextToken());
			
			int n = Integer.parseInt(br.readLine());
			int cx, cy, r;
			int cnt = 0;
			
			for(int i = 0; i < n; i++) {
				st = new StringTokenizer(br.readLine());
				cx = Integer.parseInt(st.nextToken());
				cy = Integer.parseInt(st.nextToken());
				r = Integer.parseInt(st.nextToken());
				
				boolean start = containTrue(sx, sy, cx, cy, r);
				boolean end = containTrue(ex, ey, cx, cy, r);
				
				if((start || end) && !(start && end)) {
					cnt++;
				}
			}
			
			System.out.println(cnt);
		}
	}
	
	public static boolean containTrue(int x0, int y0, int x1, int y1, int r) {
		return Math.sqrt(Math.pow(x0-x1, 2) + Math.pow(y0-y1, 2)) < r;
	}
}
