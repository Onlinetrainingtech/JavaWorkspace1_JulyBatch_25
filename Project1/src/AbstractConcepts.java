abstract class Sample13
{
	abstract void get11();
	public void get12()
	{
		System.out.println("This is get2 function");
	}
}
class D14 extends Sample13
{
	public void get11()
	{
		System.out.println("This is get1 function");
	}
}
public class AbstractConcepts {

	public static void main(String[] args) {
		
		D14 f1=new D14();
		f1.get12();
		f1.get11();

	}

}
