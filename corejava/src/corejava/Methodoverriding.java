//Method overriding
class A
{
	void run()
	{
		System.out.println("Hi");
	}
}
 class Methodoverriding extends A
 {
	 void run()
	 {
		 System.out.println("Hello");
	 }
 
  
 void main() {
	 B ob=new B();
	 A ob1=new A();
	 ob.run();
	 ob1.run();
 }
 }


