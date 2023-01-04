#include <iostream>
using namespace std;

int arr[101] = { 0, };
int dp[10001] = { 0, };

int main() {
	int n, k;
	cin >> n >> k;

	for (int i = 1; i <= n; i++) {
		cin >> arr[i];
	}

	dp[0] = 1;
	for (int i = 1; i <= n; i++) {
		for (int j = arr[i]; j <= k; j++) {
			dp[j] += dp[j - arr[i]];
		}
	}

	/*for (int i = 1; i <= k; i++) {
		cout << dp[i] << " ";
	}
	cout << endl;*/

	cout << dp[k] << endl;
	
	return 0;
}