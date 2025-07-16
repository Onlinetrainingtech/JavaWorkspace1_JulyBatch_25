
public class ArmStrong {

	public static void main(String[] args) {
		
		int s=0,n=202;
		int temp,rem;
		temp=n;
		while(n>0)
		  {
		    rem=n%10;
		    s=s+rem*rem*rem;
		    n=n/10;
		    }
		if(temp==s)
		{
			System.out.println("Its ArmStrong Number"+temp);
		}
		else
		{
			System.out.println("Its Not ArmStrong Number"+temp);
		}

	}

}
