package studio7;

public class Die {
		
		 public int side;
		
public Die (int side) {
			 this.side = side;
}
public int getside() {
	 return side;
}
public void setSide (int x) {
	 this.side = x;
}
public int throwDie () {
	int a = getside();
	return ((int)(Math.random()*(a))+1);
}
public static void main (String [] args) {
	Die a = new Die (7);
	System.out.println(a.getside());
	System.out.println(a.throwDie());
}}