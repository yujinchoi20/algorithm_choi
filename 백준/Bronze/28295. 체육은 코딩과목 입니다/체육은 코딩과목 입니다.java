import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] direction = new int[10]; //방향 저장
		int start = 0;
		//0도, 360도 = 북, 90도 = 동, 180도 = 남, 270도 = 북
		
		for(int i = 0; i < 10; i++) {
			direction[i] = Integer.parseInt(br.readLine());
		}		
		br.close();
		
		//System.out.println("START: " + start);
		for(int i = 0; i < 10; i++) {
			if(direction[i] == 1) {
				start += 90;
				if(start > 360) start -= 360;
				if(start < 0) start += 360;
				
				//System.out.println("Right : " + start);
			} else if(direction[i] == 2) {
				start += 180;
				if(start > 360) start -= 360;
				if(start < 0) start += 360;
				
				//System.out.println("Back : " + start);
			} else {
				start -= 90;
				if(start > 360) start -= 360;
				if(start < 0) start += 360;
				
				//System.out.println("LEFT : " + start);
			}
		}
		
		if(start == 0 || start == 360) System.out.println("N"); //북
		if(start == 90) System.out.println("E"); //동
		if(start == 180) System.out.println("S"); //남
		if(start == 270) System.out.println("W"); //서
	}
}