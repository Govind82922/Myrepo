package STRING;

public class builder {
	public static void main(String args[]) {
//		StringBuilder str = new StringBuilder("Hello"+ " ");
//		str.append("world");
//		System.out.println(str);
//		
//		str.setCharAt(0, 'm');
//		System.out.println(str);
//		
//		str.setCharAt(0, 'k');
//		System.out.println(str);
//		
//		str.insert(0, 'f');
//		System.out.println(str);
//		
//		str.deleteCharAt(0);
//		System.out.println(str);
		
		StringBuilder sb = new StringBuilder("123456");
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
		
		sb.delete(1, 5);
		System.out.println(sb);
	}

}
