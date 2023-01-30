#include <iostream>
using namespace std;

int arr[1000001];

int main() {
	ios::sync_with_stdio(false);
	cin.tie(NULL); cout.tie(NULL);

	int n, m;
	cin >> m >> n;

	//모든 수를 소수라고 가정하고, 
	//조건에 만족하지 않을 경우 소수가 아닌 것으로 판단하여 0을 대입
	for (int i = 2; i <= n; i++) {
		arr[i] = i;
	}

	for (int i = 2; i * i <= n; i++) {
		if (arr[i] == 0) continue; //이미 소수가 아닌걸로 제외된 정수 

		for (int j = i * i; j <= n; j += i)
			arr[j] = 0;
	}

	for (int i = m; i <= n; i++) {
		if (arr[i] != 0) cout << arr[i] << '\n';
	}

	return 0;
}