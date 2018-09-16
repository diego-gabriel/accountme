#include <iostream>

using namespace std;

int abs(int a)
{
	return a > 0 ? a : -a;
}

int fun(int a, int b, int c, int d)
{
	if (a == b && b == c && c == d && d == a)
		return 0;
	return 1 + fun(abs(a - b), abs(b - c), abs(c - d), abs(d - a));
}


int main()
{
	int a, b, c, d;

	while(cin>>a>>b>>c>>d && (a || b || c || d))
	{
		cout<<fun(a, b, c, d)<<endl;
	}
	return 0;
}