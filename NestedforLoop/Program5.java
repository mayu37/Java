/*
 12 12 12
 11 11 11 
 10 10 10 
 9  9  9
 */
package NestedforLoop;

public class Program5 {
	public static void main(String []args) {
		int x=12;
		for(int i = 1;i<=4;i++) {
			for(int j = 1;j<=4;j++) {
				System.out.print(x+ " ");
			}
			x--;
			System.out.println();
		}
	}

}
