import java.io.*; //BufferedReader, IOException, InputStreamReader
import java.util.Arrays;

public class Main {
	public static int g(int a, int b) { //공약수 구하기 
		int r;
		while(b != 0) {
			r = a % b;
			a = b;
			b = r;
		}
		
		return a;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N]; //c, c++과 달리 java는 배열의 크기를 변수를 사용해 동적으로 선언할 수 있다. 
		
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(arr); 
		
		//M은 (6 - 34)와 (34 - 38)의 공약수!
		int t = arr[1] - arr[0]; //음수의 값이 나오지 않도록 큰 수에서 작은 수를 빼준다.
		
		for(int i = 2; i < N; i++) {
			t = g(t, arr[i] - arr[i-1]); //공약수 갱신 
		}
		
		//결론적으로 최대공약수와 그 외에 공약수를 구하는 문제
		for(int i = 2; i <= t; i++) {
			if(t % i == 0) 
				System.out.print(i + " ");
		}
	}
}