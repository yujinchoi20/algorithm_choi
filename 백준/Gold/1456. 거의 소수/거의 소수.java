import java.io.*;
import java.util.*;

public class Main {
	static long A, B;
	static ArrayList<Long> prime = new ArrayList<>();
	static long[] arr;
	static long cnt = 0, N = 2;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		A = Long.parseLong(st.nextToken());
		B = Long.parseLong(st.nextToken());
		
		//B의 제곱근을 사용하여 N제곱하긴 전의 소수의 범위를 지정
		//B=1000 -> 제곱근B = 31.xxx 
		//소수의 범위는 2 ~ 31 : 2,3,5,7,11,13,17,19,23,29,31
		//각각의 소수에 몇 제곱을하여 B를 넘어가지 않는 거의 소수의 개수를 찾으면 됨
		
		long b = (long) Math.sqrt(B);
		makePrimeArr(b); //소수List 생성
		
		/*
		 * while(true) { if(prime.size() == 0) break; //N을 1씩 증가 //prime.get() ^ N의 수가
		 * B를 넘어가면 prime에서 해당 소수를 삭제 //prime의 길이가 0이되면 반복문 종료
		 * 
		 * for(int i = 0; i < prime.size(); i++) { long tmp =
		 * (long)Math.pow(prime.get(i), N); if(tmp <= B) { if(tmp >= A) cnt++; } else
		 * if(tmp > B) { prime.remove(i); } } N++; //System.out.println(prime.size());
		 * //첫 번째 오류 -> 끝나는 범위만 지정을 하고 시작 범위를 확인 안함. }
		 */
		
		ArrayList<Long> list = new ArrayList<>();
		for(int i = 0; i < prime.size(); i++) {
			if(prime.get(i) >= B) break;
			
			for(int j = 2; true; j++) {
				if((long)Math.pow(prime.get(i), j) > B) break;
				list.add((long)Math.pow(prime.get(i), j));
			}
		}
		
		Collections.sort(list);
		int s = 0;
		int e = list.size() - 1;
		while(s <= e) {
			int mid = (s + e) / 2;
			if(list.get(mid) >= A) e = mid - 1;
			else s = mid + 1;
		}
		
		System.out.println(list.size() - s);
	}
	
	public static void makePrimeArr(long end) { //소수로만 이루어진 List 생성
		arr = new long[(int) (end + 1)];
		
		for(int i = 2; i <= end; i++) {
			arr[i] = i;
		}
		
		for(int i = 2; i * i <= end; i++) {
			if(arr[i] == 0) continue;
			for(int j = i * i; j <= end; j+=i) {
				arr[j] = 0;
			}
		}
		
		for(int i = 2; i <= end; i++) {
			if(arr[i] != 0) { //소수이면 추가
				prime.add(arr[i]);
			}
		}
	}
}