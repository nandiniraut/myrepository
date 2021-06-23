#include<iostream>
using namespace std;
int main(){
	int t;
	float sal,b;
	cout<<"enter the number of years of employment: ";
	cin>>t;	
	if(t>5)
	{
	    cout<<"enter current salary: ";
	    cin>>sal;
	    b=0.05*sal;
	    cout<<"your bonus is "<<b;
	}
	else
	{
		cout<<"no bonus";
	}
	
	return 0;
}
