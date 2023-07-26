/*1A 2B 3C 4D
 *1A 2B 3C 4D
 *1A 2B 3C 4D
 *1A 2B 3C 4D
 */

package NestedForLoop2;

public class Program4 {
	public static void main(String[] args) {
		for(int i = 1;i<=4;i++) {
			int num = 1;
			char ch = 'A';
			for(int j=1;j<=4;j++) {
				System.out.print(num+""+ch+" ");
				num++;
				ch++;
			}
			System.out.println();
		}
	}

}
