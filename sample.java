

class sample
{
	public static void main(String[]arg);

int i;
double d;

sample(int arg1) //constructor
{
System.out.println("running samlpe(int) cnstructor");
i=arg1;
}

sample(double arg1)
{
System.out.println("running samlpe(double) cnstructor");
d=arg1;
}

sample(int arg1, double arg2)
{
System.out.println("running samlpe(int,double) cnstructor");
i=arg1;
d=arg2;
}
}


class Demo{
	public static void main(String[]arg)
{
System.out.println("program starts....!");

sample ref1 = new sample(21); // instance creation
System.out.println("i value " +ref1.i); // o/p :- i value : 21
System.out.println("d value " +ref1.d); // o/p :- d value : 0

System.out.println ("********");

sample ref2 = new sample(2.1);
System.out.println("i value " +ref2.i); // o/p :- i value : 0
System.out.println("d value " +ref2.d); // o/p :- d value : 2.1

System.out.println ("********");

sample ref3 = new sample(2,2.1);

System.out.println("i value " +ref3.i); // o/p :- i value : 2

System.out.println("d value " +ref3.d); // o/p :- i value : 2.1


System.out.println("program ends....!");
}

}
