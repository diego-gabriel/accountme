#include <iostream>

using namespace std;

int det[2][2];

int fact(int n)
{
	int res = 0;

	return n == 0 ? 1 : n*fact(n-1);
}

int main()
{
	int n;

	while (cin>>n && n != 42)
	{
		cout<<n<<endl;
	}
	return 0;
}