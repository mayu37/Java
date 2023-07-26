//Write a program to check whether the number a palindrome number or not (2332)
package SimpleWhileLoop;

public class Program10 {
	public static void main(String [] args) {
		int num = 2332;
		int rev = 0;
		int temp = num;
		while(temp!=0) {
			rev = rev*10+ (temp%10);
			temp/=10;
		}
		if(num == rev) {
			System.out.println(num+ "is a palindrome number: ");
		}else {
			System.out.println(num+ "is Not a palindrome number: ");
		}
	}

}
