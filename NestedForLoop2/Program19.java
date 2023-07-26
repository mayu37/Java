/*1
 *8 27
 *64 125 216 
 */

package NestedForLoop2;

public class Program19 {
	public static void main(String[] args) {
		int num =3;
		int a=1;
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(a*a*a+" ");
				a++;
			}
			System.out.println();
		}
	}

}
