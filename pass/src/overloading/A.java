package overloading;

import java.lang.classfile.attribute.ModuleMainClassAttribute;

public class A {
int a; double b; String c;
A(){
	a=100; b=45.32; c="ankit";
}
A(int x){
a=x;
}
A(double Y, String z)
{
	b=Y; c=z;
	
}
}

class B{
	public static void main(String[] args) {
		A r=new A();
		A r2=new A(10);
		A r3=new A(23.56, "anuju");
		System.out.println(r.a+" "+r2.b+r3.c);
			System.out.println(r2.a);
			System.out.println(r3.b+" "+r3.c);
			
		}
	
		
	}

