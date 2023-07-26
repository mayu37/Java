//Write a program to print the Square of even digits of the given number.
package SimpleWhileLoop;

public class Program5 {
	public static void main(String []args) {
		int num = 942111423;
		while(num!=0) {
			int rem = num%10;
			if(rem%2 ==0) {
				System.out.print((rem*rem)+ " ");
			}
			num/=10;
		}
		System.out.println("\n");
	}

}
