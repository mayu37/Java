//Write a program to print the count down of day to submit the assignment
package SimpleWhileLoop;

public class Program8 {
	public static void main(String [] args) {
		int day = 7;
		if(day == 0) {
			System.out.println(day+ "Day Assignment is overdue");
		}else {
			while(day>=1) {
				System.out.println(day+"Day remaining");
				day--;
			}
			if(day == 0) {
				System.out.println(day+"Day remaining is overdue: ");
			}
		}
	
	}
}
