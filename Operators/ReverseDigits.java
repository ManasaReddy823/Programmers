//ReverseDigits: Write a program to reverse a 3-digit number. Ex: num : 123        O/P : 321

public class ReverseDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num =123;
		
		
		
		int num1=(num/100);
		num = num%100;
		int num2=num/10;
        int num3=num%10;
        
        
		
		int rev_num= (num3*100) + num2*10 +  num1;
		
		System.out.println("number is "+ rev_num);
		
		
		
		

	}

}
