package pass;
import java.util.ArrayList;
import java.util.Collections;

public class arraylisttest {
//	static void reverseList(ArrayList<Integer>List) {
//	int i=0,j=List.size()-1;
//	
//	while(i<j) {
//	Integer temp = Integer.valueOf(List.get(i));
//	List.set(i,List.get(j));
//	List.set(j,temp);
//	i++;
//	j++;
//	}
//	}	
//	public static void main(String[] args) {
//		
//		ArrayList<Integer> L1 = new ArrayList<>();
//		// Add element
//		
//		L1.add(5);
//		L1.add(6);
//		L1.add(7);
//		L1.add(8);
//		System.out.println(L1.get(0));
//		System.out.println(L1.get(3));
//		
//		
//		
////print with for loop
//		for(int i=0; i<L1.size(); i++) {
//			System.out.println(L1.get(i));
//		}	
//		
//		
//// print array list direct
//			System.out.println(L1);
//			
//			
//			
//// add elememnt on some element
//			L1.add(1,100);
//			System.out.println(L1);
//			
//			
////removing an element of index i
//			L1.remove(1);
//			System.out.println(L1);
//			
//			
//			
////removing an element of e
//			L1.remove(Integer.valueOf(7));
//		System.out.println(L1); 
//		
//		
//		
////checking if an element exsisting or not
//		boolean ans = L1.contains(Integer.valueOf(5));
//		System.out.println(ans);
//		
//	

	public static void main(String[] args) {
		ArrayList<Integer> List = new ArrayList<>();
		List.add(0);
		List.add(10);
		List.add(3);
		List.add(5);
		List.add(22);
		List.add(10);
	System.out.println("original list "+ List);
	Collections.reverse(List);
	//reverseList(List);
	System.out.println("Reversed List" + List);
		Collections.sort(List);
		System.out.println("Ascending order "+List);
		
		ArrayList<String> l1 = new ArrayList<>();
		l1.add("welcome");
		l1.add("to");
		l1.add("home");
		System.out.println("OG =" + l1);
		Collections.sort(l1,Collections.reverseOrder());
		System.out.println("sorted"+l1);
	}

}
