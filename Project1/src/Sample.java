
public class Sample 
{
   String empname="azar";//class or instance variable
   void get1()
   {
	   int empid=1001;//local variable
	   System.out.println("This is get1 function"+empid);
   }
   void get2()
   {
	   System.out.println("This is get2 function"+empname);
   }
	public static void main(String[] args) {
	
		System.out.println("This is Main Function");
		
		Sample f1=new Sample();
		f1.get1();
		f1.get2();

	}

}
