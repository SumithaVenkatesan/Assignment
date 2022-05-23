package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//0, 1, 1,2, 3,5,8,13,21,34
				int num1 = 0;
				int num2 = 1;
				int num3;
				System.out.print(num1);
				System.out.print(num2);
				for(int i = 1; i <=10; i++) {
					num3 = num1 + num2; 
					System.out.print(num3);
					
					//swap the numbers
					num1 = num2;
					num2 = num3;
				}
	}

}
