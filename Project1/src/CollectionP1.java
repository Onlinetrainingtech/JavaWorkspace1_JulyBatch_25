import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class CollectionP1 {

	//HashSet<Integer>list1=new HashSet<Integer>();
	//TreeSet<Integer>list1=new TreeSet<Integer>();
	ArrayList<Integer>list1=new ArrayList<Integer>();
	void get1()
	{
		list1.add(1001);
		list1.add(1001);//dulipcate
		list1.add(1002);
		list1.add(1003);
		System.out.println("Your value is::"+list1);
		System.out.println("Searching is::"+list1.contains(1001));
		System.out.println("Removing is::"+list1.remove(1001));
		System.out.println("Searching is::"+list1.contains(1001));
		System.out.println("Total size of the data is::"+list1.size());
	}
	public static void main(String[] args) {
		
		CollectionP1 f1=new CollectionP1();
		f1.get1();

	}

}
