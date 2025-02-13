package encapslation;

public class driver {
	public static void main(String args[]) {
		auto s1=new auto();
		s1.setRoll(101);
		s1.setName("ram");
		s1.setDept("cse");
		
//		s1.getRoll();
//		s1.getName();
//		s1.getDept();
	
		System.out.println(s1.getRoll()+ ":"+s1.getName()+":"+s1.getDept() );
	}

}
