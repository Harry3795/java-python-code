package test;

public class Bank {
	
	float getRateOfInterest(){
		
		System.out.println("All bank Interest Rate :");
		return 0;
		
	}
}
	
 class sbi extends Bank{
		float getRateOfInterest(){
			float rate=8;
			System.out.println("SBI bank Interest Rate :"+rate);
			return 8;
			
		} 
	}
 class  icici extends Bank{
		float getRateOfInterest(){
			float rate=7;
			System.out.println("ICICI bank Interest Rate :"+rate);
			return 7;
			
		} 
	}
 class axis extends Bank{
		float getRateOfInterest(){
			float rate=9;
			System.out.println("AXIS bank Interest Rate :"+rate);
			return 9;
			
		} 
	}
class newbank{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		sbi s=new sbi();
		icici i=new icici();
		axis a=new axis();
		s.getRateOfInterest();
		i.getRateOfInterest();
		a.getRateOfInterest();
	}
}

