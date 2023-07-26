/*F
 *E 1
 *D 2 E
 *C 3 D 4
 *B 4 C 6 D
 *A 5 B 8 C 9
 */

package NestedforLoop;

public class Program16 {
	public static void main(String[] args) {
		int num=6;
		char ch = 'F';
		int a=1;
		for(int i=1; i<=num;i++) {
			char temp = ch;
			for(int j=1;j<=i;j++){
				if(j%2==1) {
					System.out.print(temp+" ");
					temp++;
				}else {
					System.out.print(a++ +" ");
				}
				
			}
			ch--;
			System.out.println();
		}
		
	}

}
