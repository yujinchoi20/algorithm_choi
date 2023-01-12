#include <iostream>
#include <map>
#include <set>
using namespace std;

map<string, bool> m;
set<string> s;

int main() {
	int N, M;
	cin >> N >> M;

	string str;
	for (int i = 0; i < N + M; i++) {
		cin >> str;
		if (m[str] == true) s.insert(str);
		else m[str] = true;
	}

	cout << s.size() << endl;

	//set<string>::iterator
	for (set<string>::iterator it = s.begin(); it != s.end(); it++) {
		cout << *it << endl;
	}

	return 0;
}