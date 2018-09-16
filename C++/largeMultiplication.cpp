#include <iostream>
#include <cstring>

using namespace std;

string ceros(int n)
{
	string res = "";

	while (n--)
	{
		res = res + "0";
	}

	return res;
}

int toInt(string x)
{
	int res;

	if (x.length() == 1) res = x[0] - '0';
	else res = 0;
	return res;
}

string toString(int x)
{
	string res = "";

	while (x)
	{
		res = char((x % 10) + '0') + res;
		x /= 10;
	}

	return res != "" ? res : "0";
}

void quitZero(string &cad)
{
	while (cad[0] == '0' && cad.length() >= 1)
	{
		cad.erase(cad.begin());
	}
}

void trans(string &cad, int n)
{
	while (n--)
	{
		cad = "0" + cad;
	}
}

int abs(int x)
{
	return x < 0 ? 10 + x : x;
}

string restar (string a, string b)
{
	string res = "";
	int carry, la, lb;

	la = a.length();
	lb = b.length();

	trans(b, la - lb);

	carry = 0;
	
	for (int i = a.length() - 1; i >= 0; i--)
	{
		int na, nb;
		na = a[i] - '0';
		nb = b[i] - '0';
		res = char(abs(na - nb - carry) + '0') + res;
		carry = (na - nb - carry < 0 ? 1 : 0);
	}

	return res;
}

string suma (string a, string b)
{
	string res = "";
	int carry, la, lb;

	la = a.length();
	lb = b.length();

	if (la > lb)
		trans(b, la - lb);
	if (lb > la)
		trans(a, lb - la);

	carry = 0;

	for (int i = a.length() - 1; i >= 0; i--)
	{
		int na, nb;
		na = a[i] - '0';
		nb = b[i] - '0';

		res = char(((na + nb + carry) % 10) + '0') + res;
		carry = (na + nb + carry) / 10;
	}

	if (carry != 0)
		res = char(carry + '0') + res;
	return res;
}

string mult (string x, string y)
{
	string xl, xr, yl, yr;
	string p1, p2, p3;
	string res;

	if (max(x.length(), y.length()) == 1) res = toString(toInt(x) * toInt(y));
	else
	{
		int n = max(x.length(), y.length());
		if (x.length() < y.length()) swap(x, y);
		trans(y, x.length() - y.length());

		xl = x.substr(0, x.length() / 2);
		xr = x.substr(x.length() / 2);

		yl = y.substr(0, y.length() / 2);
		yr = y.substr(y.length() / 2);

		p1 = mult(xl, yl);
		p2 = mult(xr, yr);
		p3 = mult(suma(xl, xr), suma(yl, yr));
	
		res = suma(suma(p1 + ceros(n), restar(restar(p3, p1), p2) + ceros((n+1)/2)), p2);
	}
	
	quitZero(res);
	
	return res;
}


int main()
{
	string a, b;

	while (cin>>a>>b)

	cout<<mult(a, b)<<endl;
		
	return 0;
}