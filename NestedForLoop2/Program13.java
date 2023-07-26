/*10
 *9 8
 *7 6 5 
 *4 3 2 1 
 */

package NestedForLoop2;

public class Program13 {
	public static void main(String[] args) {
		int num = 4;
		int a = 10;
		for(int i=1; i<=num;i++) {
			for(int j =1;j<=i;j++) {
				System.out.print(a+" ");
				a--;
			}
			System.out.println();
		}
	}

}
