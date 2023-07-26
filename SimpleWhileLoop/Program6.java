/*Write a program to print the sum of all even numbers and 
the multiplication of odd numbers between 1 to 10*/
package SimpleWhileLoop;

public class Program6 {
	public static void main(String []args ) {
		int sum = 0;
		int var =1;
		int i= 1;
		while(i<=10) {
			if(i%2==0) {
			sum = sum+i;
		}else
			var = var*i;
			i++;
		} 
		System.out.println("Sum of Even Number Between 1 to 0 = "+sum);
		System.out.println("Multply of Odd numbers Between 1 to 10 = "+var);
	}

}
