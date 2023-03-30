package studio7;

public class Rectangle {
	
 public double length;
 public double width;
 
 public Rectangle (double length, double width) {
	 this.length = length;
	 this.width = width;
 }
 
 public double getlength() {
	 return length;
 }
 public double getwidth() {
	 return width;
 }
 public void setLength (double x) {
	 this.length = x;
 }

 public void setWidth (double y) {
	 this.width = y;
	 
}
public double area () {
	double a = getlength();
	double b = getwidth();
	double area = a*b;
	return area;
}

public double perimeter () {
	double c = getlength();
	double d = getwidth();
	double perimeter = c + c + d + d;
	return perimeter;
}
public boolean ifSquare() {
	double length = getlength();
	double width = getwidth();
	if (width==length) {
		return true;
	}
	else {
		return false;
	}}
public boolean isBigger(Rectangle r) {
	if(this.area() > r.area()) {
		return true;
	}
	else {
		return false;
	}}
	
public static void main (String [] args) {
	Rectangle a = new Rectangle (4, 3);
	Rectangle b = new Rectangle (5, 5);
	System.out.println(a.getlength());
	System.out.println(a.getwidth());
	System.out.println(b.getlength());
	System.out.println(b.getwidth());
	System.out.println(a.area());
	System.out.println(b.area());
	System.out.println(a.perimeter());
	System.out.println(b.perimeter());
	System.out.println(a.ifSquare());
	System.out.println(b.ifSquare());
}

}
