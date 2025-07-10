import java.io.DataInputStream;
import java.io.IOException;

public class DataInputStreamP1 {

	int pid,pprice;
	String pname;
	DataInputStream dis=new DataInputStream(System.in);
	void input() throws  IOException
	{
		System.out.println("Enter the pid and pprice is::");
		pid=Integer.parseInt(dis.readLine());
		pprice=Integer.parseInt(dis.readLine());
		System.out.println("Enter the pname is::");
		pname=dis.readLine();
	
	}
	void display()
	{
		System.out.println("Your data is::"+pid+"::"+pprice+"::"+pname);
	}
	public static void main(String[] args) throws IOException {
		
		DataInputStreamP1 f1=new DataInputStreamP1();
		f1.input();
		f1.display();

	}

}
