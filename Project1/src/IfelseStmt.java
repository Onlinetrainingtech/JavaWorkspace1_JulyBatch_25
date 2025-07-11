import java.util.Scanner;

public class IfelseStmt {

	int a,b;
	Scanner sc=new Scanner(System.in);
	void get1()
	{
		System.out.println("Enter the a and b value is::");
		a=sc.nextInt();
		b=sc.nextInt();
	}
	void display()
	{
		if(a%b==0)
		{
			System.out.println("Its is Even"+a);
		}
		else
		{
			System.out.println("Its is Odd");
		}
	}
	public static void main(String[] args) {
		
		IfelseStmt f1=new IfelseStmt();
		f1.get1();
		f1.display();

	}

}
