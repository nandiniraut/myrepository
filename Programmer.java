class Employee{  
 float salary=40000;  
}  
class Programmer extends Employee{ // "extends" keyword is used for inheritance 
 int bonus=10000;  
 public static void main(String args[]){  
   Programmer p=new Programmer();  // object is created with "new" keyword
   System.out.println("Programmer salary is:"+p.salary);  
   System.out.println("Bonus of Programmer is:"+p.bonus);  
}  
}  
