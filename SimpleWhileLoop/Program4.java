//Write a program to count the odd digits of the given number.
package SimpleWhileLoop;

public class Program4 {
	public static void main(String []args) {
		int num = 942111423;
		int count = 0;
		while(num!=0) {
			int rem = num%10;
			if(rem%2==1) {
			count++;
			}
			num = num/10;
		}
		System.out.println("Count of Odd Numbers: " +count);
	}
}
