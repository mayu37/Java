//Write a program to calculate the factorial of the given number.
package SimpleWhileLoop;

public class Program2 {
	public static void main(String []args) {
		int n = 7;
		int fact = 1;
		int var = 1;
		while(var<=n) {
			fact = fact*var;
			var++;
		}
		System.out.println("Factorial of: " +n+ " is " +fact);
	}

}
