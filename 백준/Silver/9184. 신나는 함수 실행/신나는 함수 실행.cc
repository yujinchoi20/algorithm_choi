#include <iostream>
using namespace std;

int w[21][21][21];

int solution(int a, int b, int c) {
	if (a <= 0 || b <= 0 || c <= 0)
		return 1;

	if (a > 20 || b > 20 || c > 20)
		return solution(20, 20, 20);

	if (w[a][b][c])
		return w[a][b][c];

	if (a < b && b < c) {
		w[a][b][c] = solution(a, b, c - 1) + solution(a, b - 1, c - 1) - solution(a, b - 1, c);
		
		return w[a][b][c];
	}

	w[a][b][c] = solution(a - 1, b, c) + solution(a - 1, b - 1, c) + solution(a - 1, b, c - 1) - solution(a - 1, b - 1, c - 1);
	
	return w[a][b][c];
}

int main() {
	int a, b, c;
	
	while (1) {
		cin >> a >> b >> c;
		if (a == -1 && b == -1 && c == -1) break;

		cout << "w(" << a << ", " << b << ", " << c << ") = " << solution(a, b, c) << endl;
	}

	return 0;
}