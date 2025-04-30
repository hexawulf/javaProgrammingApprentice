package conceptsLab;

public class lab
{


	    // Inner class Sup
	    static class Sup {
	        void who() {
	            System.out.println("Who() in Sup");
	        }
	    }

	    // Inner class Sub1
	    static class Sub1 extends Sup {
	        void who() {
	            System.out.println("Who() in Sub1");
	        }
	    }

	    // Inner class Sub2
	    static class Sub2 extends Sup {
	        void who() {
	            System.out.println("Who() in Sub2");
	        }
	    }

	    public static void main(String[] args) {
	        Sup superOb = new Sup();
	        Sub1 subOb1 = new Sub1();
	        Sub2 subOb2 = new Sub2();

	        Sup supRef;

	        supRef = superOb;
	        supRef.who();

	        supRef = subOb1;
	        supRef.who();

	        supRef = subOb2;
	        supRef.who();
	        
	        // Example of method overriding
		            try {
		                int[] arr = new int[2];
		                int result = 10 / 0;               // ArithmeticException
		                int value = arr[5];                // ArrayIndexOutOfBoundsException
		            } catch (ArithmeticException ex) {
		                System.out.println("Divide by zero error.");
		            } catch (ArrayIndexOutOfBoundsException ex) {
		                System.out.println("Array index out of bounds.");
		            } catch (Exception ex) {
		                System.out.println("Some other exception: " + ex.getMessage());
		            
		            }    
	        
		            public interface Trackable {public void track();} class Flight implements Trackable {private int flightNumber; public int getFlightNumber() return flightNumber;} public Flight (int flightNumber) {this.flightNumber = flightNumber;}public void track(){System.out.printlin("Flight " +flightNumber + " is currently being tracked.")}}
		            
		            
	    public interface Monitorable {
	    	public void monitor();
	    }
	    public class Car implements Monitorable {
	    	private String licensePlate; 
	    	public Car(String licensePlate)
	    	{
	    		this.licensePlate = licensePlate;
	    		} 
	    	public String getLicensePlate(){
	    		return licensePlate;}
	    	public void monitor(){
	    		System.out.println("Car with license plate " + licensePlate + " is being monitored.");
	    	}
	    }

	   

	    
	    
}
