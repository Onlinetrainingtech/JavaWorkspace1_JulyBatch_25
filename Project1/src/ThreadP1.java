
public class ThreadP1 extends Thread
{

	public void run()
	{
		try
		{
		System.out.println("ThreadIN");
		Thread.sleep(10000);
		System.out.println("ThreadOUT");
		}
		catch(InterruptedException t)
		{
			System.out.println(t);
		}
	}
	void get1()
	{
		System.out.println("This is Normal methods..");
	}
	public static void main(String[] args) {
		
		ThreadP1 t1=new ThreadP1();
		t1.start();
		ThreadP1 t2=new ThreadP1();
		t2.start();
		t1.get1();

	}

}
