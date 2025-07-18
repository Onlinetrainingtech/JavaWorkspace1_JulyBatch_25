class B
{
	int empid=1001;
	void get1()
	{
		System.out.println("This is Baseclass::"+empid);
	}
}
class D extends B
{
	void get2()
	{
		System.out.println("This is Dervied class::"+empid);
	}
}
public class SingleInheritance {

	public static void main(String[] args) {
		
		D f1=new D();
		f1.get1();
		f1.get2();

	}

}
