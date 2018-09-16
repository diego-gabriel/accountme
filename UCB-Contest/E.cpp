#include <iostream>
#include <cstring>
#include <vector>
#include <algorithm>
#include <map>
#include <stack>

using namespace std;

int m;
map <char, int> id;
string op;

bool isOp(char k)
{
	return k == '+' || k == '*' || k == '-' || k == '(';
}

bool fun(vector<int> &valor)
{
	stack <int> num;
	stack <char> ops;
	for (int i = 0; i < op.length(); i++)
	{
		char k = op[i];
		//cout<<k<<endl;
		if (k == ')')
		{
			//cout<<"OPERATION"<<endl;
			while (!ops.empty() && ops.top() != '(')
			{
				char o = ops.top();
				ops.pop();
			//	cout<<"op: "<<o<<endl;
				switch (o)
				{
					case '+': {
						int a, b;
						a = num.top();
						num.pop();
						b = num.top();
						num.pop();
						num.push(a + b);
					} break;
					case '-': {
						int a, b;
						a = num.top();
						num.pop();
						b = num.top();
						num.pop();
						num.push(a - b);
					} break;
					case '*': {
						int a, b;
						a = num.top();
						num.pop();
						b = num.top();
						num.pop();
						num.push(a * b);
					} break;
				}
			}
			if (!ops.empty()) ops.pop();
		}
		else
		if (isOp(k))
		{
			ops.push(k);
		}
		else
			num.push(valor[id[k] - 1]);//, cout<<"PUSH"<<endl;
	}
	while (!ops.empty() && ops.top() != '(')
		{
			char o = ops.top();
			ops.pop();
		//	cout<<"op: "<<o<<endl;
			switch (o)
			{
				case '+': {
					int a, b;
					a = num.top();
					num.pop();
					b = num.top();
					num.pop();
					num.push(a + b);
				} break;
				case '-': {
					int a, b;
					a = num.top();
					num.pop();
					b = num.top();
					num.pop();
					num.push(a - b);
				} break;
				case '*': {
					int a, b;
					a = num.top();
					num.pop();
					b = num.top();
					num.pop();
					num.push(a * b);
				} break;
			}
		}

	//cout<<num.top()<<endl;
	return num.top() == m;

}

int main()
{
	int n;

	while (cin>>n && n)
	{
		vector <int> valor;
		id.clear();
		int v;
		for (int i = 0; i < n; i++)
		{
			cin>>v;
			valor.push_back(v);
		}
		cin>>m;
		cin>>op;

		int c = 1;
		for (int i = 0; i < op.length(); i++)
		{
			if (op[i] >= 'a' && op[i] <= 'z')
				if (id[op[i]] == 0)
				{
					id[op[i]] = c;
					c++;
				}
		}

		bool res = false;
		int ID[c-1];
		vector <int> val = valor;
		for(int i = 0; i < c-1; i++)
		{
			ID[i] = c-1;
		}
		int last = c-1;
		while (ID[0] > 0 && !res)
		{
			for (int i = 0; i < c-1; i++)
			{
				val[i] = valor[ID[i]-1];
			}
			res = fun(val);
			ID[c-2]--;
			if (ID[c-2] == 0 && !res)
			{
				int t = 2;

				while (c - t > 0 && ID[c - t] == 0)
				{
					ID[c-t] = c-1;
					t++;
					ID[c-t]--;
				}
			}

		}
		if (res) cout<<"YES"<<endl;
		else cout<<"NO"<<endl;

	}
}