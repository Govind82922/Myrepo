package encapslation;


class getterORsetter{
	 private int age;
	 private String name;
	
	public int getage() {
		return age;
	}
	
// SETTER METHOD	
	public void setage(int n) {
	 age = n;
}
 
//	getterORsetter	
	public String getname() {
		return name;
	}
	
// SETTER METHOD	
	public void setname( String s) {
		name = s;
	}
}
public class setter {
	public static void main(String args[]) {
		getterORsetter obj = new getterORsetter();

	obj.setage(30);
	obj.setname("reddy");
		
		System.out.println(obj.getage()+":"+ obj.getname());
	 
	}

}

