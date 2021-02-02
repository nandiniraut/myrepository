class sample
{
int i;
double d;

sample(int arg1) //constructor
{
system.out.println("running samlpe(int) cnstructor");
i=arg1;
}

sample(double arg1)
{
system.out.println("running samlpe(double) cnstructor");
d=arg1
}

sample(int arg1, double arg2)
{
system.out.println("running samlpe(int,double) cnstructor");
i=arg1;
d=arg2;
}
}

class Demo{
public static void main(String[] args)
{
system.out.println("program starts....!");

Sample ref1 = new Sample(21); // instance creation
system.out.println("i value " +ref1.i); // o/p :- i value : 21
system.out.println("d value " +ref1.d); // o/p :- d value : 0

system.out.println(-------------------);

Sample ref2 = new Sample(2.1);
system.out.println("i value " +ref2.i); // o/p :- i value : 0
system.out.println("d value " +ref2.d); // o/p :- d value : 2.1

system.out.println(-------------------);

Sample ref3 = new Sample(2,2.1);
system.out.println("i value " +ref3.i); // o/p :- i value : 2
system.out.println("d value " +ref3.d); // o/p :- i value : 2.1


system.out.println("program ends....!");
}
}