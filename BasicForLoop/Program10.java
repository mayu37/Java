//Write a program to print the product of the first 10 number
package BasicForLoop;

public class Program10 {
	public static void main(String args[]){
		int product =1;
		for(int i=1;i<=10;i++){
			product = product*i;
		}
		System.out.println("Sum of first 10 number is: " +product);
	}
}
