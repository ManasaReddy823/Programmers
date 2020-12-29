//TwoDigitsSum: Write a program to calculate the sum of the first and the second last digit of a 5 digit number.
				 //Ex : 12345        O/P : 1+4=5

public class TwoDigitsSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number = 12345;
		
		int first = number/10000;
		number =number % 10000;
		int second = number/1000;
		number =number % 1000;
		int third = number/100;
		number =number % 100;
		int fourth = number/10;
		int fifth = number % 10;
		System.out.println(first);

		
		System.out.println("sum of two digits " +  (first+fourth));
		

	}

}
