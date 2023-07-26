//Write a java program to find a maximum between three numbers..

package IfElse;

public class Program6 {
	public static void main(String[] args) {
		int num1 = 42;
		int num2 = 32;
		int num3 = 52;
		 /*if(num1>num2 && num1>num3) {
			 System.out.println(num1+" is Maximum Between "+num1+","+num2+" and"+num3);
		 }else if(num2>num1 && num3>num2) {
			 System.out.println(num2+" is Maximum Between "+num1+","+num2+" and"+num3);
		 }else if(num3>num1 && num3>num2) {
			 System.out.println(num3+" is Maximum Between "+num1+","+num2+" and"+num3);
		 }else if(num1>num2 && num1==num3) {
			 System.out.println(num1+" is Greater Than "+num2+","+num2+" and equal to "+num3);
		 }if(num2>num3 && num2==num1){
			 System.out.println(num2+" is Greater than "+num3+","+num2+" and equal to "+num1);
		 }if(num3>num1 && num3==num2) {
			 System.out.println(num3+" is Greater than "+num1+" and equal to"+num2);
		 }else {
			 System.out.println("All Number are equal!!!");
		 }

		
	*/
		if (num1 >= num2 && num1 >= num3) {
			System.out.println( num1 + " is the maximum number.");
			
		}else if (num2 >= num1 && num2 >= num3) {
			System.out.println( num2 + " is the maximum number.");
		}else {
			System.out.println( num3 + " is the maximum number.");
			
		}
	}
}
