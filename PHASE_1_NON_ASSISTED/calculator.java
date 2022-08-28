package demo;
import java.util.Scanner;
class calculator {
  public static void main(String[] args) {
    char c;
    Double num1, num2, result;
    Scanner sc = new Scanner(System.in);
    System.out.println("Choose an operator: ");
    c = sc.next().charAt(0);
    System.out.println("Enter number 1: ");
    num1 = sc.nextDouble();
    System.out.println("Enter number 2: ");
    num2 = sc.nextDouble();
    switch (c) {
      case '+':
        result = num1 + num2;
        System.out.println("Result: " + num1 + " + " + num2 + " = " + result);
        break;
      case '-':
        result = num1 - num2;
        System.out.println("Result: " + num1 + " - " + num2 + " = " + result);
        break;
      case '*':
        result = num1 * num2;
        System.out.println("Result: " + num1 + " * " + num2 + " = " + result);
        break;
      case '/':
        result = num1 / num2;
        System.out.println("Result: " + num1 + " / " + num2 + " = " + result);
        break;
      default:
        System.out.println("Invalid operator!");
        break;
    }
  }
}