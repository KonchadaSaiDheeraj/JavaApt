package DAY19;

class Bike {
	String brand = "Hero Honda Bike";

    public Bike() {
        System.out.println("Bike constructor called..."); 
    }

    public void displayInfo() {
        System.out.println("This is a Bike...");
    } 
}

class Honda extends Bike {
	
    String brand = "Honda";

    public Honda() {
        super();   // super keyword for parent class constructor
        System.out.println("Honda constructor called...");   
    }

    public void displayInfo() {
        
        super.displayInfo();   // super keyword for parent class method

        System.out.println("Parent brand: " + super.brand);   // super keyword for parent class variable

        System.out.println("Child brand: " + brand);
        
        System.out.println("This is a Honda Bike.");
    }
}
    
public class KeywordSuper {
	public static void main(String[] args) {
		Honda cb = new Honda();
		cb.displayInfo();	
	}
}
