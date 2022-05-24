/*
		Model:Storage Container
		1. Single value containers | primitive types
			a single value
			
			Integral
			Floating Point
			Character
			Logical
			
		2. Multi value containers | Reference types
			more than one value
			2.1 Homogeneous
				String
				Arrays
				Object
			2.2 Heterogeneous
				Object
			
		View
		
		Controller
		
		Data types-> To create a storage we need to define the type of it
		1.Integral
			byte   8 bits
			short  16 bits
			int    32 bits
			long   64 bits
		2. Floating Point
			float 32 bits
			double 64 bits
		3. Character
			char 16 bits
		4. Logical
			boolean 8 bits (out of 8 bits only 1 bit is used)
		 */

//class is a basic requirement for the java program
public class DataTypes {
	//main method
	//from where the execution begins
	public static void main(String[] args) {
		
		byte age = 35; //35 here is literal and age is variable
		//age is 8 bits(in stack) while 35 is 32 bits(in constant pool[integer literal is by default 32 bits])
		//implicit downcasting in action as 32 bits literal will be copied to an 8 bit variable
		
		//age=128; results in error as overflow is there. 128(in 32 bits) cannot be contained in 8 bits.
		//8 bits->2power8 | 256 |256/2 | -128 to 0 to 127
		//we can do manual downcasting but it is problematic as we may loose our data
		
		age=(byte)128;
		
		short s = 120;//same logic working here
		//constant pool has 120 integer literal of 32 bit of which 16 bits are getting copied to s variable
		
		int eWallet = 300;// 32bits === 32bits equated
		
		//long l = 9977285562; it is an error
		//because constant pool of 32 bits cannot store such big number in it
		// to create a integer literal of 64bits in the constant pool we need to put l or L after the literal
		
		long l = 9977285562l;//here integer literal is of 64 bits and it is getting copied to a 64 bits variable l
		long m = 4;//this is fine and here upcasting is in action, 32 bits stored in 64 bit variable
		
		int number = (int)m;//it is downcasting from long to int. no loss of data here as 4 can be easily stored
		//in 32 bits. loss of data occurs when it can't be stored and still we are storing.
		
		
		//Floating point
		//float f=76.6; it is an error as floating points are stored in constant pools as 64 bits f=32bits | 76.7 = 64 bits
		// and in above 64 bit literal assigned to 32 bit variable
		
		float f=76.6f;// this is fine, 32 bit(in constant pool)== 32 bit in stack
		
		double d = 99.5; //64 bits(constant pool)== 64 bits(stack)
		
		//down casting
		float pi = (float)3.14;
		//up casting
		double piAgain = pi;
		
		char ch = 65;//Ascii code
		ch='A'; // store the character directly in single quotes
		//it can store unicode in single quote as well
		
		char name1 = '\u0924';
		char name2 = '\u0930';
		char name3 = '\u0942';
		char name4 = '\u0923';
		System.out.println(name1+""+name2+""+name3+""+name4);
		
		boolean internet = true;
		internet = false;
		System.out.println("is internet enabled: "+internet); //only one bit is used out of 8 bits
		
		//Primitives cannot store data as multiple values
		//eg.
		//int numbers = 10,20,30; //this is an error
		

	}

}
