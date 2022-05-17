package week1.day2;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int number=153;
		int reminder;
		int result = 0;
		int tmpVal;
		tmpVal = number;
		
		while(tmpVal > 0) {
			reminder = tmpVal % 10;
			result+=Math.pow(reminder, 3);
			tmpVal/=10;
		}
		if(result==number) {
			System.out.println("Its an Armstrong number "+result);
		}else {
			System.out.println("Its not an Armstrong number "+result);
		}

	}


}
