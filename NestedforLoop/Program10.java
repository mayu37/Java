/*1
 *3 4
 *6 7 8
 *10 11 12 13
 *15 16 17 18 19
 */

package NestedforLoop;

public class Program10 {
	public static void main(String[] args) {
		int num =5;
		int a=1;
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(a++ +" ");
			}
			a++;
			System.out.println();
		}
	}

}
