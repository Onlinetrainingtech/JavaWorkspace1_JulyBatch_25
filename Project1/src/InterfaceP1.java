interface F1
{
	void get1();
}
interface F2 extends F1
{
	int pid=1001;
	void get2();
}
class Sample20 implements F2
{
	public void get1()
	{
		System.out.println("This is get1 function");
	}
	public void get2()
	{
		System.out.println("This is get2 function"+pid);
	}
}
public class InterfaceP1 {

	public static void main(String[] args) {
		
		Sample20 f1=new Sample20();
		f1.get1();
		f1.get2();

	}

}
