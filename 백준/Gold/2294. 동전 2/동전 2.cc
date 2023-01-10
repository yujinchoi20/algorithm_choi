#include <iostream>
using namespace std;

int coin[101] = { 0, };
int dp[10001] = { 0, };

int main() {
	int n, k;
	cin >> n >> k;

	for (int i = 1; i <= k; i++) {
		dp[i] = 10001; //답은 10000까지만 가능함.
	}

	for (int i = 1; i <= n; i++) {
		cin >> coin[i]; 
		//j >= coin[i]
		for (int j = coin[i]; j <= k; j++) {
			dp[j] = min(dp[j], dp[j - coin[i]] + 1); //배열을 손으로 적어보면 찾을 수 있음 
		}
	}

	/*for (int i = 1; i <= k; i++) {
		cout << dp[i] << " ";
	}
	cout << endl;*/

	if (dp[k] == 10001) cout << "-1" << endl;
	else cout << dp[k] << endl;
	return 0;
}