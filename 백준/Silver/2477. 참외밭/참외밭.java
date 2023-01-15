import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int K = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		int[] direction = new int[6];
		int[] length = new int[6];
		
		int rowMax = 0, colMax = 0;
		int rowIdx = -1, colIdx = -1;
		int bigRec = 0, smallRec = 0;
		
		for(int i = 0; i < 6; i++) {
			st = new StringTokenizer(br.readLine());
			direction[i] = Integer.parseInt(st.nextToken());
			length[i] = Integer.parseInt(st.nextToken());
			
			//1, 2 -> 가로, 3, 4 -> 세로
			if(direction[i] == 1 || direction[i] == 2) {
				if(rowMax < length[i]) {
					rowMax = length[i];
					rowIdx = i;
				}
			}
			else {
				if(colMax < length[i]) {
					colMax = length[i];
					colIdx = i;
				}
			}
		}
		bigRec = rowMax * colMax;
		smallRec = length[(rowIdx + 3) % 6] * length[(colIdx + 3) % 6];
		
		System.out.println((bigRec - smallRec) * K);
	} 
}