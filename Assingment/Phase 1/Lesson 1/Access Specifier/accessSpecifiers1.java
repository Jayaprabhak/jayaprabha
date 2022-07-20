package demo;
class defaccessSpecifiers {
	void display() {
		System.out.println("You are using default access specifiers");
	}
}
public class accessSpecifiers1 {
public static void main(String [] args) {
	System.out.println("Default access specifiers");
	defaccessSpecifiers obj = new defaccessSpecifiers();
	obj.display();
}
}