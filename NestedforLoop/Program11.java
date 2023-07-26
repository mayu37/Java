/*C2W10
 *C2W9 C2W8
 *C2W7 C2W6 C2W5
 *C2W4 C2W3 C2W2 C2W1
 */

package NestedforLoop;

public class Program11 {
	public static void main(String[] args) {
		int num=4;
		int a =(num*(num+1))/2;
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("C2W"+a+" ");
				a--;
			}
			System.out.println();
		}
		
	}

}
