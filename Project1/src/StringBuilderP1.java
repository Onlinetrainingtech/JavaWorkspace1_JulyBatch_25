
public class StringBuilderP1 {

	public static void main(String[] args) {

		StringBuilder sb=new StringBuilder("welcome");
		System.out.println(sb.append("azar"));
		System.out.println(sb.delete(0, 3));
		System.out.println(sb.insert(0,"mohamed"));
		System.out.println(sb.reverse());
		System.out.println(sb.replace(0,4,"*****"));
		System.out.println(sb.deleteCharAt(0));

	}

}
