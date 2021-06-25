#include<iostream>
using namespace std;
int main(){
	int a,b,c,g,l;
	cout<<"enter ages of three people: ";
	cin>>a>>b>>c;
	if(a>b && a>c){
		if(b>c)
		{
			l=c;
		}
		else
		{
			l=b;
		}
		g=a;
	}
	else if(b>a && b>c){
		if(a>c)
		{
			l=c;
		}
		else
		{
			l=a;
		}
		g=b;
	}
	else {
		if(b>a)
		{
			l=a;
		}
		else
		{
			l=c;
		}
		g=c;
	}
	cout<<"the greatest age is "<<g;
	cout<<" and the lowest age is "<<l;
	
	
	return 0;
}
