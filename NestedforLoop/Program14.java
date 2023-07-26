/*A B C D
 *B C D
 *C D
 *D
 */

package NestedforLoop;

public class Program14 {
	public static void main(String[] args) {
		int num =4;
		char ch ='A';
		for(int i=1;i<=num;i++) {
			char temp = ch;
			for(int j=1;j<=num-i+1;j++) {
				System.out.print(temp+" ");
				temp++;
			}
			ch++;
			System.out.println();
		}
	}

}
