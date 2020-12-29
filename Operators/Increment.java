/*int i = 20;
	int n = i++%5;
	-> What are the values of i and n after the code is executed?
	-> What are the final values of i and n if instead of using the postfix increment operator (i++), you use the prefix version (++i))?*/

public class Increment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 20;
		int n = i++%5;
		
		System.out.println("value is " + n);


		
		int i1 = 20;
		int n1 = ++i1 % 5 ;
		
		System.out.println("value is " + n1);
		
		

	}

}
