import java.util.Scanner;

public class NestedIfElse {

	int age,bns,sal;
	Scanner sc=new Scanner(System.in);
	void get1()
	{
		System.out.println("Enter the age is::");
		age=sc.nextInt();
		if(age>=61)
		{
			System.out.println("Enter the salary is::");
			sal=sc.nextInt();
			if(sal>=20000)
			{
				bns=sal+1000;
				System.out.println("Your salary is::"+bns);
			}
			else
			{
				bns=sal+1500;
				System.out.println("Your salary is::"+bns);
			}
		}
		else
		{
			System.out.println("Age is low");
		}
	}

	public static void main(String[] args) {
		
		NestedIfElse f1=new NestedIfElse();
		f1.get1();

	}

}
