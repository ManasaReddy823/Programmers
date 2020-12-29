
public class LogicalOpertors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 5;
        System.out.println(x > 3 && x < 10); //true
        System.out.println(x > 3 || x < 10);  //true
        System.out.println(!(x > 3 && x < 10)); //false

        int a = 25, b = -11, c = 0;
        System.out.println((a<c && b<c) && (a>c && b>c)); //false
        System.out.println((a>c && b<c) && (a<c && b>c)); //false
        
        System.out.println((a<c && b<c) || (a>c && b>c)); //false	
        System.out.println((a>c && b<c) || (a<c && b>c)); //true
        
        System.out.println((a<c || b<c) && (a>c || b>c)); //true
        System.out.println((a>c || b<c) && (a<c || b>c)); //false
        
        System.out.println((a<c || b<c) || (a>c || b>c)); //true	
        System.out.println((a>c || b<c) || (a<c || b>c)); //true

	}

}
