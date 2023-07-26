/*Write a program that take a number is even print that number is reverse order or if the 
number is odd print that number in reverse order by difference two.*/
package SimpleWhileLoop;

public class Program7 {
	public static void main(String []args) {
		int num = 8;
		if(num%2==0) {
			while(num>=1) {
				System.out.println(num+" ");
				num--;
			}
		}else {
			while(num>=1) {
				System.out.println(num+" ");
				num = num - 2;
			}
		System.out.println();
		}
	}
}
