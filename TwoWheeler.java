package week1.day1;

public class TwoWheeler {
	int noOfWheels;
	short noOfMirrors;
	long chasisNumber;
	boolean isPunctured;
	String bikeName;
	double runningKM;
	

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		TwoWheeler bike= new TwoWheeler();
		bike.bikeName="TVS Scooty";
		bike.noOfWheels= 2;
		bike.noOfMirrors= 2;
		bike.chasisNumber= 1234;
		bike.runningKM= 100;
		bike.isPunctured= true;
		
		
		
		System.out.println("Bike Name: "+bike.bikeName);
		System.out.println("Bike Mirror count : "+bike.noOfMirrors);
		System.out.println("Bike wheels count : "+bike.noOfWheels);
		System.out.println("Bike chasisNumber : "+bike.chasisNumber);
		System.out.println("is bike punctured: "+bike.isPunctured);
		System.out.println("Running kilometer: "+bike.runningKM);
			
	}

}
