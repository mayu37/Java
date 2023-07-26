/*1
 *8 9
 *27 16 125 
 *64 25 216 49
 */

package NestedforLoop;

public class Program18 {
	public static void main(String[] args) {
		int num =4;
		for(int i=1;i<=num;i++) {
			int a =i;
			for(int j=1;j<=i;j++) {
				if(j%2==0) {
					System.out.print(a*a*a+"\t");
				}else {
					System.out.print(a*a+"\t");
				}
				a++;
			}
			System.out.println();
		}
	}

}
