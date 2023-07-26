/*1 2 3 4
 *4 5 6
 *6 7
 *7
 */

package NestedForLoop2;

public class Program20 {
	public static void main(String[] args) {
		int num = 4;
		int a = 1;
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=num-i+1;j++) {
				System.out.print(a+" ");
				a++;
			}
			a--;
			System.out.println();
		}
	}

}
