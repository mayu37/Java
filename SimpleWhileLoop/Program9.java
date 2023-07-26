//Write a program to reverse the given number.
package SimpleWhileLoop;

public class Program9 {
	public static void main(String []args) {
		int num = 942111423;
		int rev = 0;
		int temp = num;
		int rem = 0;
		while(temp!=0){
			rem = temp%10;
			rev=rev*10+rem;
			temp = temp/10;
			
		}
		System.out.println(num+ "After Reverse" +rev);
	}

}
