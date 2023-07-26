/*Write a program in java to accept three numbers and check whether they are
 * pythagorean triples or not.. 
 */
package IfElse;

public class Program9 {
	public static void main(String[] args) {
		int a=2,b=2,c=2;
		if(a*a == b*b + c*c || b*b == a*a + b*b || c*c == a*a + b*b ) {
			System.out.println("Triangle Is Pythagorean Triplet");
		}else {
			System.out.println("Triangle Is Not a Pythagorean Triplet");
		}
	}

}
