package constructor;

public class circle {
double x,y;
double r;
double circumfrence() {
	return 2*3.14159;
}
// METHOD THAT RETURN AREA
 double area() {
	 return(22/7)*r*r;
 }


public static void main(String args[]) {
	circle c = new circle();
	c.x =0.0;
	c.y =0.0;
	c.r =5.0;
	System.out.println("circum "+c.circumfrence());
	System.out.println("Area   "+c.area());
}
}