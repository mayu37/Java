/*14 15 16 17
 *15 16 17 18
 *16 17 18 19
 *17 18 19 20
 */

package NestedForLoop2;

public class Program3 {
	
	public static void main(String[] args) {
		for(int i=1;i<=4;i++) {
			int x = 13+i;
			for(int j =1;j<=4;j++) {
				System.out.print(x++ +" ");

			}
			System.out.println();
			x++;
		}
	
	}

}
