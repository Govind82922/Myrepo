package encapslation;


 class demo {
	
	private int age = 11;
	private String name = "Navin";
	
	public int getAge()
	{
		return age;
	}
	
	
	public String getName() {
		return name;
	}
}

public class demo1 {
	
	public static void main (String a[]) {
		
		demo obj = new demo();
		
		System.out.println(obj.getName());
		System.out.println(obj.getAge());
	}

}


