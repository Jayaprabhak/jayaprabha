package demo;
class priaccessSpecifiers {
	private void display() {
		System.out.println("You are using private access specifiers");
	}
}
public class accessSpecifiers2 {
public static void main(String [] args) {
	System.out.println("Private access specifiers");
	priaccessSpecifiers obj = new priaccessSpecifiers();
}
}