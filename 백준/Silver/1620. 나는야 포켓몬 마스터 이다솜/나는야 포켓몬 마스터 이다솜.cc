#include <iostream>
#include <map>
#include <vector> 
#include <string>
using namespace std;

string str;
vector<string> v;
vector<string> re;
map<string, int> m;

int main() {
	ios::sync_with_stdio(false);
	cin.tie(NULL); cout.tie(NULL);

	int N, M;
	cin >> N >> M;

	for (int i = 0; i < N; i++) {
		cin >> str;
		v.push_back(str);
		m.insert(make_pair(str, i));
	}
	for (int i = 0; i < M; i++) {
		cin >> str;
		if (str[0] >= 65 && str[0] <= 90) {
			re.push_back(to_string(m[str] + 1));
		}
		else {
			re.push_back(v[stoi(str) - 1]);
		}
	}
	
	for (int i = 0; i < re.size(); i++) {
		cout << re[i] << '\n';
	}

	return 0;
}