
public class ITC {

	public synchronized void get1()throws InterruptedException
	{
		System.out.println("In Get1");
		wait(10000);
		get2();
		System.out.println("Out Get1");
	}
	public void get2()
	{
		notify();
	}
	public static void main(String[] args) throws InterruptedException {
		
		ITC f1=new ITC();
		f1.get1();

	}

}
