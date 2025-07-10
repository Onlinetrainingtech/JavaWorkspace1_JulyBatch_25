import java.util.Scanner;

public class OperatorsP1 {

	int a,b;
	Scanner sc=new Scanner(System.in);
	void arithmeticOperator()
	{
		System.out.println("Enter the a and b value is:");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Add::"+(a+b));
		System.out.println("Sub::"+(a-b));
		System.out.println("Mult::"+(a*b));
		System.out.println("Div::"+(a/b));
	}
	void relationOperator()
	{
		System.out.println("Enter the a and b value is::");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("RelationOperator");
		System.out.println("Lessthan::"+(a<b));
		System.out.println("Greaterthan::"+(a>b));
		System.out.println("Equalthan::"+(a==b));
		System.out.println("NotEqual::"+(a!=b));
	}
	void logicalOperator()
	{
		System.out.println("LogicalOperator");
		System.out.println("Enter the a and b value is::");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("LogicalOperator");
		System.out.println("LogicalAND::"+((a>b)&&(b<a)));
		System.out.println("LogicalOR::"+((a<b)||(b<a)));
		System.out.println("LogicalNOT::"+(!(a>b)));
	}
	void bitWiseOperator()
	{
		System.out.println("BitwiseOperator");
		System.out.println("Enter the a and b value is::");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("BitWiseAND::"+(a&b));
		System.out.println("BitWiseOR::"+(a|b));
		System.out.println("BitWiseXOR::"+(a^b));
		System.out.println("LeftShift::"+(a<<1));
		System.out.println("RightShift::"+(a>>1));
		System.out.println("Ones::"+(~(a)));
	}
	
	public static void main(String[] args) {
		
		OperatorsP1 f1=new OperatorsP1();
		//f1.arithmeticOperator();
		//f1.relationOperator();
		//f1.logicalOperator();
		f1.bitWiseOperator();

	}

}
