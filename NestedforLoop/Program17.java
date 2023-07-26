/*10 
 *I H
 *7 8 9
 *D C B A
 */

package NestedforLoop;

public class Program17 {
	public static void main(String[] args) {
		int num =4;
		char ch = 'J';
		int a =10;
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=i;j++) {
				if(i%2==0) {
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
