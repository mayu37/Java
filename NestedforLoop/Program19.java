/*1
 *8 9
 *9 64 25
 *64 25 216 49
 */

package NestedforLoop;

public class Program19 {
	public static void main(String[] args) {
		int num =4;
		int a=1;
		for(int i=1;i<=num;i++) {
			int temp =a;
			for(int j=1;j<=i;j++) {
				if(i%2!=0) {
					System.out.print(temp*temp*temp+"\t");
				}else if(j%2==0) {
					System.out.print(temp*temp+"\t");
				}else if(j%2!=0) {
					System.out.print(temp*temp*temp+"\t");
				}else {
					System.out.print(temp*temp+"\t");
				}
			}
			temp++;
		}
		a++;
		System.out.println();
	}

}
