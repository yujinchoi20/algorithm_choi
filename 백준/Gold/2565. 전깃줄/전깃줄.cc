#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

vector<pair<int, int>> v;
int dp[101] = { 0, };

int main() {
	int n, N, result = 0;
	int a, b;

	cin >> n;
	N = n;

	v.emplace_back(0, 0);
	while (n-- > 0) {
		cin >> a >> b;
		v.emplace_back(a, b);
	}
	sort(v.begin(), v.end());

	for (int i = 1; i <= N; i++) {
		for (int j = 0; j < i; j++) {
			if (v[i].second > v[j].second && dp[j] >= dp[i]) {
				dp[i] = dp[j] + 1;
			}
		}
		result = max(result, dp[i]);
	}

	cout << N - result << endl;
	return 0;
}