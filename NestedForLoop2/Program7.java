/*1 2 9
 *4 25 6
 *49 8 81
 */

package NestedForLoop2;

public class Program7 {
	public static void main(String[] args) {
		int a =1;
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=3;j++) {
				if(a%2==1) {
					System.out.print(a*a +" ");
					a++;
				}else {
					System.out.print(a+ " ");
					a++;
				}
				
		}
			System.out.println();
			
	}
		
	}

}
