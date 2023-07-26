//Write a unique real-time example of If Else If Else Ladder

package IfElse;

public class Program10 {
	public static void main(String[] args) {
		
		float AccBal = 4000;
		
		if(AccBal < 4000) {
			System.out.println("Your Account Balance Is Low!!");
		}else if(AccBal == 4000) {
			System.out.println("Your Account Balance Is Sufficient ");
		}else if(AccBal > 4000) {
			System.out.println("your Account Balance Was is High");
		}
	}

}
