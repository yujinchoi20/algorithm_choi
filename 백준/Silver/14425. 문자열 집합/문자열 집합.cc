#include <iostream>
#include <map>
using namespace std;

map<string, bool> s;


int main() {
	ios::sync_with_stdio(false);
	cin.tie(NULL); cout.tie(NULL);

	int N, M;
	cin >> N >> M;

	string str;
	int cnt = 0;

	for (int i = 0; i < N; i++) {
		cin >> str;
		s.insert(pair<string, bool>(str, true));
	}

	for (int i = 0; i < M; i++) {
		cin >> str;
		if (s[str] == true) {
			cnt++;
			continue;
		}
	}

	cout << cnt << '\n';
	return 0;
}
