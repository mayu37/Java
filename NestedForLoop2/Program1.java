/* C2W1 C2W2 C2W3
 * C2W1 C2W2 C2W3
 * C2W1 C2W2 C2W3
 * C2W1 C2W2 C2W3 
 */
package NestedForLoop2;

public class Program1 {
	public static void main(String[] args) {
		int num = 3;
		for(int i = 1;i<=num;i++) {
			int var=1;
			for(int j =1;j<=num;j++) {
				System.out.print("C2W"+var+ " ");
				var++;
			}
			System.out.println();
		}
		}

}