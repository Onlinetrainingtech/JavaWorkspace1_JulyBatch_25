import java.util.Scanner;

public class ArrayP1 {

	int empid[]=new int[5];
	int i,n;
	Scanner sc=new Scanner(System.in);
	
	void get1()
	{
	   System.out.println("Enter the n value is::");
	   n=sc.nextInt();
	   for(i=0;i<n;i++)
	   {
		   System.out.println("Enter the array value is::");
		   empid[i]=sc.nextInt();
		   System.out.println("Your array value is::"+empid[i]);
	   }
	}
	public static void main(String[] args) {
		
		ArrayP1 f1=new ArrayP1();
		f1.get1();

	}

}
