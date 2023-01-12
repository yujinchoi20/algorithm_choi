#include <iostream>
#include <map>
using namespace std;

map<int, int> m; //입력 받은 정수, 정수의 개수 

int main() {
	ios::sync_with_stdio(false);
	cin.tie(NULL); cout.tie(NULL);

	int N, M, num;
	
	cin >> N;
	for (int i = 0; i < N; i++) {
		cin >> num;
		m[num]++; //bool이 아닌 int로 타입을 정했기 때문에 ++하면 개수가 저장됨.
	}

	cin >> M;
	for (int i = 0; i < M; i++) {
		cin >> num;
		cout << m[num] << " "; //입력된 정수의 개수를 출력
	}

	return 0;
}