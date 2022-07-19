package demo;

public class callMethod {
int a = 150;
int operation(int a) {
	a = a*10/100;
	return a;
}
public static void main(String [] args) {
	callMethod b = new callMethod();
	System.out.println("Before operation: " +b.a);
	b.operation(100);
	System.out.println("After operation: " +b.a);
}
}