package week1.day1;

public class Car {
	
	//Accessmodifier returnType/Nonretrun methodName()
	public void applyBreak() {
		System.out.println("Applying break...");
	}
	
	public void applyGear() {
		System.out.println("Applying the Gear...");
	}
	public void switchOnAC() {
		System.out.println("swith on the AC...");
	}
	public void applyAccelerate() {
		System.out.println("Apply the Accelerate...");
	}
	//Accessmodifier returnType(primitive datatypes)/Nonretrun(void) methodName()


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car myCar= new Car();
		myCar.applyBreak();
		myCar.applyGear();
		myCar.applyAccelerate();
		myCar.switchOnAC();
		
	}

}
