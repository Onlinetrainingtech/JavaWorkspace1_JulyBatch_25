
public class CaseStudy1 {

	public static void main(String[] args) {
		
		double  totalAmount=12000;//Total purchase amount
		boolean isPremiumMember=true;//Membership status
		boolean isSeasonalPromotion=true;//Seasonal offer active
		
		double discount=0;
		
		//discount
		if(totalAmount>=5000 && totalAmount<10000)
		{
			discount=0.05;
		}
		else if(totalAmount>=10000 && totalAmount<20000)
		{
			discount=0.10;
		}
		else if(totalAmount>=20000)
		{
			discount=0.15;
		}
		//Add membership discount
		discount+=isPremiumMember?0.05:0;
		//Add seasonal promotion discount
		discount+=isSeasonalPromotion?0.05:0;

		//Final prices
		
		double finalAmount=(totalAmount-discount);
		
		//output
		
		System.out.println("TotalAmount::"+totalAmount);
		
		System.out.println("Discount Applied::"+(discount*100)+"%");
		
		System.out.println("Final Payable Amount::$"+finalAmount);
	}

}
