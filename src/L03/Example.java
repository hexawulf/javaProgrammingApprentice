package L03;
/*	public static void main(String[] args)
	{
		System.out.println("Java drives the web");
		System.out.println("Java is a powerful language");
		System.out.println("Java is a popular language");
		System.out.println("Java is a versatile language");

	}
}
*/   
// Instance variable
	public class Example {
    private String message;
    
    // Constructor
    public Example(String msg) {
        this.message = msg;
    }
    
    // Instance method
    public void displayMessage() {
        System.out.println(message);
    }
    
    public static void main(String[] args) {
        // Creating objects of class Example
        Example example1 = new Example("Java drives the web");
        Example example2 = new Example("Java is a powerful language");
        Example example3 = new Example("Java is an interpreded language");
        
        // Using the objects by calling their methods
        example1.displayMessage();
        example2.displayMessage();
        example3.displayMessage();
    }
}