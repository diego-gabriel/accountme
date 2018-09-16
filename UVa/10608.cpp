#include <iostream>
#include <map>

using namespace std;

int parent[30300];

void init(int n){
	for (int i = 1; i <= n; i++)
		parent[i] = i;
}

int find_parent(int a){
	return parent[a] == a ? a : parent[a] = find_parent(parent[a]);
}

int max(int a, int b){
	return a < b ? b : a;
}

int main(){
	int ntest;
	cin>>ntest;

	for (int test = 0; test < ntest; test++){
		int n, m;

		cin>>n>>m;
		init(n);
		for (int i = 0; i < m; i++)
		{
			int a, b;
			cin>>a>>b;
			parent[find_parent(b)] = find_parent(a);
		}

		for (int i = 1; i <= n; i++){
			find_parent(i);
		}

		map <int, int> conteo;
		int res = 0;
		for (int i = 1; i <= n; i++){
//			cout<<parent[i]<<" <- "<<i<<endl;
			conteo[parent[i]]++;
			res = max(conteo[parent[i]], res);
		}
		cout<<res<<endl;
	}

	return 0;
}