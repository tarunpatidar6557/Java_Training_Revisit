/*
 * Model
 * 
 * View
 * 
 * Controller
 * 		Logical Operations
 * 			1. Operators for computation
 * 			2. if/else and switch case for decision making
 * 			3. loops for iterations
 */
public class Operators {

	public static void main(String[] args) {
		//1. Arithmetic operators
		// +, -, *, /, %
		
		double amount = 3655.55;
		double tax = 0.18;
		double total = amount+(tax*amount);
		System.out.println(total);
		
		int number = 10;
		int buckets = 3;
		int hashcode = number%buckets;
		System.out.println("Hashcode for number "+number+" with bucket size "+buckets+" is "+hashcode);
		
		//2. Assignment Operators
		//=, +, -, *,/,%
		int eWallet = 500;//assign operator to assign the value
		
		int myWallet = eWallet;//Value Copy Operation | Copy from variable to variable
		
		//eWallet = eWallet+100;
		eWallet+=100;
		System.out.println("eWallet is: "+eWallet);
		
		eWallet%=7;
		System.out.println("eWallet now is: "+eWallet);
		
		//3. Increment and Decrement Operators
		//++ increment by 1 and -- decrement by 1
		int quantity = 1;
		quantity++; //postfix
		++quantity; //prefix
		
		quantity--;
		System.out.println("Quantity is: "+quantity);
		
		int value = quantity++; //copy and then update
		//int value = ++quantity; //update quantity and copy data into value
		System.out.println("value is: "+value);
		System.out.println("quantity is: "+quantity);
		
		//4. Conditional or Relational
		// >, <, >=, <=, ==, !=
		int cabFare = 300;
		System.out.println("Can i book a Cab? "+(eWallet>=cabFare));
		
		//5. Logical Operators
		// &&, ||, !
		int promoCodeByUser=201;
		int promoCode = 201;
		System.out.println("Can i book and get discount? "+((eWallet>=cabFare)&&(promoCode==promoCodeByUser)));
		System.out.println("Can i book and get discount? "+((eWallet>=cabFare)||(promoCode==promoCodeByUser)));
		
		boolean isGpsEnabled = true;
		System.out.println(isGpsEnabled);
		System.out.println(!isGpsEnabled);
		

	}

}
