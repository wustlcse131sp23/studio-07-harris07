package studio7;

public class Fraction {
	 public int numerator;
	 public int denominator;
	 
	 public Fraction (int numerator, int denominator) {
		 this.numerator = numerator;
		 this.denominator = denominator;
	 }
	 
	 public double getnumerator() {
		 return numerator;
	 }
	 public double getdenominator() {
		 return denominator;
	 }
	 public void setnumerator (int x) {
		 this.numerator = x;
	 }

	 public void setdenominator (int y) {
		 this.denominator = y;
	 }
	 
	 public double multiply (Fraction r) {
		double a = (this.numerator * r.numerator);
		double b = (this.denominator * r.denominator);
		double c = a / b;
		return c;
}
	 public double sum (Fraction r) {
			double a = (this.numerator/this.denominator) + (r.numerator/r.denominator);
			return a;}
	 
	 public double reciprocal (Fraction r) {
			double b = (this.denominator/this.numerator);
			return b;}
	 
	 
	 public static void main (String [] args) {
			Fraction a = new Fraction (3,4);
			Fraction r  = new Fraction (6, 5);
			System.out.println(a.multiply(r));
			System.out.println(a.sum(r));
			System.out.println(a.reciprocal(r));
	 }}
