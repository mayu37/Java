/*F 5 D 3 B 1
 *F 5 D 3 B 1
 *F 5 D 3 B 1
 *F 5 D 3 B 1
 *F 5 D 3 B 1
 *F 5 D 3 B 1
 */

package NestedForLoop2;

public class Program10 {
	public static void main(String[] args) {
		int num = 6;
		for(int i=1; i<=num;i++) {
			int a = num;
			char ch = 'F';
			for(int j=1; j<=num;j++) {
				if(j%2==1) {
					System.out.print(ch+" ");
				}else {
					System.out.print(a+" ");
				}
				ch--;
				a--;
			}
			System.out.println();
		}
	}
}
