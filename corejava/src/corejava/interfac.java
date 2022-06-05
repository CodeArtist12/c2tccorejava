package projects;

interface Myinterface
{
	public void method1();
	public void method2();
}

  public class Interface implements Pyinterface {
	  public void method()
	  {
		  System.out.println(" implementation of method 1");
	  }
	  public void method2()
	  {
		  System.out.println("Implantation of method 2");
	  }
	  
	  public static void main(String[] args) {
		  Interface ab = new Interface();
		  ab.method1();
		  ab.method2();
	  }
  }

