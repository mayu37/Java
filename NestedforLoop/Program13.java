/*1 2 3 4
 *2 3 4
 *3 4
 *4
 */

package NestedforLoop;

public class Program13 {
	public static void main(String[] args) {
		int num = 4;
		for(int i=1; i<=num;i++) {
			int temp = i;
			for(int j=1;j<=num-i+1;j++) {
				System.out.print(temp+" ");
				temp++;
			}
			System.out.println();
		}
	}

}
