/*J
 *I H
 *G F E
 *D C B A
 */

package NestedForLoop2;

public class Program18 {
	public static void main(String[] args) {
		int num = 4;
		char ch = 'J';
		for(int i =1;i<=num;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(ch--+" ");
			}
			System.out.println();
		}
	}

}
