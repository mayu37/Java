//Write a java program, Take a number and print whether it is less than 10 or grater than 10
package IfElse;

public class Program2 {
	public static void main(String[] args) {
		int num = 5;
		if(num<10) {
			System.out.println(num+" is less than 10");
		}else if(num>10) {
			System.out.println(num+" is greater than 10");
		}else {
			System.out.println(num+" is equal to 10");
		}
	}
}
