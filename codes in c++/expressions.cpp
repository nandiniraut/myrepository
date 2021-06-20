#include<iostream>
using namespace std;
int main(){
	int x = 2, y = 5, z = 0;
	bool a,b,c,d,e;
	a= (x == 2);
	b= (x != 5);
	c= (x != 5 && y >= 5);
	d= (z != 0 || x == 2);
	e= (!(y < 10));
	cout<<a<<b<<c<<d<<e;

	
	
	
	return 0;
}
