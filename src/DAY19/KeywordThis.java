package DAY19;

public class KeywordThis {
	
	String brandName;
	int estYear;
	
	public int getYear() {
		return estYear;
	}
	
	public void setYear(int estYear) {
		this.estYear = estYear;    // estYear=estYear; --> the local variable is assigning to the reference variable which is local variable.
	                               // and the above assigning is not true.
	}
	
	public String getBrandName() {
		return brandName;
	}
	
	public void setBrandName(String brandName) {
		this.brandName = brandName;  // brandName=brandName;
	}

	public static void main(String[] args) {
		KeywordThis t1 = new KeywordThis();
		t1.setBrandName("Honda");
		t1.setYear(1946);
		System.out.println("Company Name of Motorcycle: "+t1.getBrandName());
		System.out.println("Established Year of "+t1.getBrandName()+" is: "+t1.getYear());
	}
}
