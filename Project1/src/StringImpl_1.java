
public class StringImpl_1 {

	public static void main(String[] args) {
		
		String s1=new String("Welcome");
		String s2="mohamed";
		
		System.out.println("Your value is::"+s1+"\t"+s2);
		System.out.println("length is::"+s1.length());
		System.out.println("Index of 0::"+s1.charAt(0));
		System.out.println("Joining of::"+s1.concat(s2));
		System.out.println("Equal of::"+s1.equals(s2));
		System.out.println("Compare of::"+s1.compareTo(s2));
		System.out.println("StartsWith::"+s1.startsWith("W"));
		System.out.println("EndsWith::"+s1.endsWith("s"));
	}

}
