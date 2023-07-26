//Write a java program that check a number from 0 to 5 and prints its spelling.
//If the number is greater than 5 print the number is greater than 5.. 
package IfElse;

public class Program4 {
	public static void main(String[] args) {
		int num = 6;
		if(num<0) {
			System.out.println(num+" is less than zero..");
		}else if(num == 0) {
			System.out.println("It is Equal to Zero..");
		}else if(num ==1) {
			System.out.println("ONE");
		}else if(num ==2) {
			System.out.println("TWO");
		}else if(num ==3) {
			System.out.println("THREE");
		}else if(num ==4) {
			System.out.println("Four");
		}else if(num ==5) {
			System.out.println("Five");
		}else {
			System.out.println(num+" is greater than 5");
		}
		
	}
}
