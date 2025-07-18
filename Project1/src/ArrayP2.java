import java.util.Scanner;

public class ArrayP2 {

	int empid[][]=new int[2][2];
	Scanner sc=new Scanner(System.in);
	int i,j,n,m;
	void get1()
	{
		System.out.println("Enter the n and m value is::");
		n=sc.nextInt();
		m=sc.nextInt();
	}
	void get2()
	{
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
				System.out.println("Enter the Array is::");
				empid[i][j]=sc.nextInt();
				System.out.println("I value is::"+i+"J value is::"+j);
				System.out.println("Your array value is::"+empid[i][j]);
			}
		}
			
	}
	public static void main(String[] args) {
		
             ArrayP2 f1=new ArrayP2();
             f1.get1();
             f1.get2();
	}

}
