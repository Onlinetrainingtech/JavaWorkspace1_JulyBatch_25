
public class GenericClass<M> {

	public M t;
	void setValue(M t)
	{
		this.t=t;
	}
	void get1()
	{
		System.out.println("Your get1 value is::"+t);
	}
	
	public static void main(String[] args) {
		
		GenericClass<Integer>obj1=new GenericClass<Integer>();
		obj1.setValue(100);
		GenericClass<String>obj2=new GenericClass<String>();
		obj2.setValue("apple");
		obj1.get1();
		obj2.get1();

	}

}
