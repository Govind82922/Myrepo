package constructor;

public class A {
   int a;  String name;
   A()
   {
  	 
   }
     void show()
     {
    	 System.out.println(a+" "+name);
     }   
}

 class B
{
	public static void main(String args[]) {
		A a=new A();
 		a.show();
}
}

