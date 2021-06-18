#include<iostream>
using namespace std;
int main(){
	int a,b,x,c;
	cout<<"enter the two numbers: ";
	cin>>a>>b;
	cout<<"enter the operation option: "<<endl<<"1. add"<<endl<<"2. subtract"<<endl<<"3. multiply"<<endl<<"4. divide"<<endl<<"5. modulas";
	cin>>x;
	switch (x){
		case 1:
			c=a+b;
			break;
		
		case 2:
			c=a-b;
			break;
			
	    case 3:
			c=a*b;
			break;	
		
		case 4:
			c=a/b;
			break;
			
		case 5:
			c=a%b;
			break;
		
		default:
			cout<<"invalid input";
	}
	cout<<"the output is: "<<c;
	
	return 0;
}
