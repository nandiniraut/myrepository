import java.util.*;  
class UserInputForAdd   
{  
public static void main(String[] args)  
{  
Scanner sc= new Scanner(System.in);    //System.in is a standard input stream, scanner is the syntax to take input from user  
System.out.print("Enter first number- ");  
int a= sc.nextInt();  //taking first number from user
System.out.print("Enter second number- ");  
int b= sc.nextInt();  //taking second number from user
System.out.print("Enter third number- ");  
int c= sc.nextInt();  //the addition will be stored in this
int d=a+b+c;  
System.out.println("Total= " +d);  
}  
}  
