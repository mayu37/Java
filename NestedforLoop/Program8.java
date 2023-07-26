/*e e e e e
 *d d d d d
 *c c c c c
 *b b b b b
 *a a a a a
 */
package NestedforLoop;

public class Program8 {
	public static void main(String[] arga) {
		char ch = 'e';
		for(int i = 1;i<=5;i++) {
			for(int j = 1;j<=5;j++) {
				System.out.print(ch+ " ");
			}
			System.out.println();
			ch--;
		}
	}
}
