import java.util.Scanner;

public class NestedForloop {

	
	int i,j,n,m;
	Scanner sc=new Scanner(System.in);
	void get1()
	{
		System.out.println("Enter the n and m value is::");
		n=sc.nextInt();
		m=sc.nextInt();
	}
	void logic()
	{
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
				System.out.println("I value is::"+i+"J value is::"+j);
			}
		}
	}
	
	public static void main(String[] args) {
		
		NestedForloop f1=new NestedForloop();
		f1.get1();
		f1.logic();

	}

}
