/*1
 *2 3
 *4 5 6
 *7 8 9 10
 */

package NestedForLoop2;

public class Program12 {
	public static void main(String[] args) {
		int num = 4;
		int a = 1;
		for(int i=1; i<=num;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(a +" ");
				a++;
			}
			System.out.println();
		}
	}

}
