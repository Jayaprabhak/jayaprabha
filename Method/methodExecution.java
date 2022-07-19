package demo;

public class methodExecution {
	public int multiply(int a, int b) {
		int c = a*b;
		return c;
	}
public static void main(String[] args) {
	methodExecution b = new methodExecution();
	int result = b.multiply(22, 11);
	System.out.println("Multiplicatio:" +result);
}
}