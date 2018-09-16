#include <iostream>
#include <cstring>
#include <set>
#include <vector>
#include <cstdio>

using namespace std;

set <char> colorSet;

int l;
string change(string &cad, char k)
{
	//cout<<"changing: " + cad + " con: "<<k<<endl;
	for (int i = 1; i < l; i += 2)
	{
		cad[i] = k;
	}
	return cad;
}

void linea(int n, char k)
{

	while (n--)
	{
		cout<<k;
		if (k == 'A') k = 'B';
		else k = 'A';
	}

}

pair<int, int> dif(string &c)
{
	int res1, res2;
	res1 = res2 = 0;

	char k = 'A';

	for (int i = 0; i < c.length(); i++)
	{
		res1 += k != c[i];
		res2 += k == c[i];
		k = k == 'A' ? 'B' : 'A'; 
	}

	return make_pair(res1, res2);
}

int main()
{
	int n, k;
	cin>>n>>k;

	for (int i = 0; i < k; i++)
	{
		colorSet.insert('A' + i);
	}

	string cad;
	set <char> colors = colorSet;

	char next;
	char carLast = cad[0];
	string current = "";
	string res  = "";
	int changes = 0;

	if (k > 2)
	{
		cin.ignore();
		scanf("%c", &carLast);

		l = 1;
	current = current + carLast;
	//	cout<<"init current: " + current<<endl;
		for (int i = 1; i < n; i++)
		{

			scanf("%c", &next);
			//cout<<"NEXT = "<<next<<endl;
			if (carLast != next)
			{
				colors.erase(carLast);

				if (l % 2 == 0)
				{
					colors.erase(next);
				//	cout<<"borrado: "<<next<<endl;	
				} 
				if (l > 1) 
				{
					change(current, *colors.begin());
				}
				res = res + current;
				changes += l / 2;

				colors = colorSet;
				current = "";
				l = 0;
				//cout<<"current res: "+res<<endl;
			}

			l++;
			carLast = next;
			current += carLast;

		}
			colors.erase(carLast);
			if (l % 2 == 0) colors.erase(0);
			if (l > 1) change(current, *colors.begin());
			res = res + current;
			changes += l / 2;


	cout<<changes<<endl;
	cout<<res<<endl;

	}
	else
	{

		cin>>cad;
		int dif1;
		int dif2;

		pair <int, int> par = dif(cad);

		dif1 = par.first;
		dif2 = par.second;

		if (dif1 < dif2)
		{
			cout<<dif1<<endl;
			linea(n, 'A');
			cout<<endl;
		}
		else
		{
			cout<<dif2<<endl;
			linea(n, 'B');
			cout<<endl;
		}
	}



	return 0;
}