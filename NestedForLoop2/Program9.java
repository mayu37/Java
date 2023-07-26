/*1c3  4b2  9a1
 *16c3 25b2 36a1
 *49c3 64b2 81a1
 */

package NestedForLoop2;

public class Program9 {
	public static void main(String[] args) {
		int num = 1;
		int a = 3;
		for(int i=1;i<=a;i++) {
			int b = a;
			char ch ='c';
			for(int j=1; j<=a;j++) {
				System.out.print(num*num +""+ch+""+b+" ");
				num++;
				ch--;
				b--;
			}
			System.out.println();
		}
	}

}
