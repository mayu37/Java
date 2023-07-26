/*9
 *9 8
 *9 8 7 
 *9 8 7 6
 */

package NestedForLoop2;

public class Program15 {
	public static void main(String[] args) {
		int num = 4;
		for(int i=1;i<=num;i++) {
			int a =9;
			for(int j=1;j<=i;j++) {
				System.out.print(a+" ");
				a--;
			}
			System.out.println();
		}
	}

}
