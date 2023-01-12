#include <iostream>
#include <set>
using namespace std;

set<int> s;

int main() {
	int a, b;
	cin >> a >> b;

	int input, dif;
	for (int i = 0; i < a+b; i++) {
		cin >> input;
		s.insert(input);
	}

	dif = a + b - s.size();
	cout << (a + b) - (2 * dif) << endl;

	return 0;
}