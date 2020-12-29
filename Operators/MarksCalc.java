//3. MarksCalc: If the marks of Mahesh in three subjects are 88,73 and 68 respectively (each out of 100 ), write a program to calculate his total marks and percentage marks.


public class MarksCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sub1= 88;
		int sub2=73;
		int sub3=68;
		
		int total=sub1+sub2+sub3;
		float percentage= (total / 300) * 100;
		
		System.out.println("total marks " + total );
		System.out.println("percentage marks " + percentage );

	}

}
