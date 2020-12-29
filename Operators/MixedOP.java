
/* MixedOP: Write a program to add 10 to the number 456 and then divide it by 3. 
			Now, the modulus of the quotient is taken with 5 and then multiply the resultant value by 5. Display the final result.*/

public class MixedOP {

	
	public static void main(String[] args) {
		
		int number = 456;
		
		int value = (((number + 10) / 3 ) % 5) * 5;
		
		System.out.println("value is " + value );

		
		
		
		
	}
}
