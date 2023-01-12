#include <iostream>
#include <set>
using namespace std;

set<string> ss;

int main() {
	string s;
	cin >> s;

	string str = "";
	for (int i = 0; i < s.length(); i++) {
		for (int j = i; j < s.length(); j++) {
			str += s[j];
			//cout << str << endl;
			ss.insert(str);
		}
		str = ""; //문자 누적을 막기위해 reset
	}

	cout << ss.size() << endl;
	return 0;
}