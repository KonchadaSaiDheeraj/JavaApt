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
        super();
        System.out.println("Honda constructor called...");   
    }

    public void displayInfo() {
        
        super.displayInfo();

        System.out.println("Parent brand: " + super.brand);

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
