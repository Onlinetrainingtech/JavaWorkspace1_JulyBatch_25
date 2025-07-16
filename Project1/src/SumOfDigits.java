
public class SumOfDigits {

	public static void main(String[] args) {
		
		int n=123,sum=0,remainder;
		while (n != 0)
		   {
		      remainder = n % 10;
		      sum       = sum + remainder;
		      n         = n /10;
		   }
		System.out.println("Sum of digits::"+sum);

	}

}
