import java.util.Scanner;

public class SwitchCasePrg {

	public static void main(String[] args) {
		
		int exp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Exp is::");
		exp=sc.nextInt();
		switch(exp)
		{
		case 1:
			System.out.println("Case-1");
			break;
		case 2:
			System.out.println("Case-2");
			break;
		case 3:
			System.out.println("Case-3");
			break;
		default:
			System.out.println("Default case");
			break;
		}

	}

}
