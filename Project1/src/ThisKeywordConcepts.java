
public class ThisKeywordConcepts {

	int pid;
	String pname;
	void get1(int pid,String pname)
	{
		this.pid=pid;
		this.pname=pname;
		System.out.println("Argument Data is::"+pid+""+pname);
	}
	void get2()
	{
		System.out.println("Get2 function is::"+pid+""+pname);
	}
	public static void main(String[] args) {
		
		ThisKeywordConcepts f1=new ThisKeywordConcepts();
		f1.get1(1001,"apple");
		f1.get2();
	}

}
