/*10 10 10 10
 *11 11 11
 *12 12
 *13
 */

package NestedForLoop2;

public class Program16 {
	public static void main(String[] args) {

		int a = 10;
		for(int i=1; i<=4;i++) {
			for(int j=1; j<=4-i+1;j++) {
				System.out.print(a+" ");
			}
			a++;
			System.out.println();
		}
	}

}
