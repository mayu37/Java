/*10
 * 10 9
 * 9  8 7
 * 7  6 5 4
 */

package NestedforLoop;

public class Program12 {
	public static void main(String[] args) {
		int num = 4;
		int a =10;
		for(int i=1; i<=num;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(a+" ");
				a--;
			}
			a++;
			System.out.println();
		}
		
	}

}
