/*3C 3C 3C 3C
 *3C 3C 3C
 *3C 3C 
 *3C
 */

package NestedForLoop2;

public class Program14 {
	public static void main(String[] args) {
		for(int i=1; i<=4;i++) {
			for(int j=1; j<=4-i+1;j++) {
				System.out.print("3C ");
			}
			System.out.println();
		}
	}
	

}
