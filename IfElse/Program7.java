/*Calculate Profit or Loss..
 * Write a program that takes the cost price(take it hard coded)and 
 * calculates its profit or loss
 */
package IfElse;

public class Program7 {
	public static void main(String[] args) {
		int Selling_Price = 300;
		int Cost_Price = 500;
		if(Selling_Price > Cost_Price) {
			System.out.println("Profit of "+(Selling_Price - Cost_Price));
		}else if(Selling_Price < Cost_Price) {
			System.out.println("Profit of "+(Cost_Price-Selling_Price));
		}else {
			System.out.println("***No loss No profit***");
		}
	}

}
