#include<iostream>
using namespace std;
int main(){
	int p,d;
	cout<<"eneter the purchase quantity: ";
	cin>>p;
	if(p>1000)
	{
		d=0.1*p;
	}
	else
	{
		d=0;
	}
	cout<<"the discount is "<<d;
	
	
	return 0;
}
