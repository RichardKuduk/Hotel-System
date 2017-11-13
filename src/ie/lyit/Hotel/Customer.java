package ie.lyit.Hotel;

public class Customer extends Person { // INHERITANCE Customer IS-A Person 
	// Customer has name , address and phoneNumber from Person
	private String emailAddress;
	private int number;
	private static int nextNumber = 1; // static for unique number - start off at 1
	
	// Default constructor
	 public Customer()
	 {
		 super(); // NOTE => Don't need to call super() explicitly
		 emailAddress = null;
		 number = nextNumber++;
	 }
	 // Initialization constructor 
	 // Called when object is created like this
	 // ==> Customer customerA = new Customer("Mr" , "Joe" , "Doe" , " 12 High Road Letterkenny" , "0877776665" , "joe@hotmail.com);
	 public Customer(String t , String fN , String sn , String pNo , String email)
	 {
		 // Call super class constructor = passing parameters required by Person
		 super(t,fN,sn,pNo,email);
		 // and then initialize  Customers own instance variables
		 emailAddress = email;
		 // and set number to static nextNumber before incrementing nextNumber
		 number = nextNumber++;
	 }
	 
	 // toString method
	 @Override
	 public String toString()
		{
			return super.toString() + "," + emailAddress;
		}
	 
	 // Equals method called when comparing an object witj another object if(cust1.equals(cust2))
	 // ==> Probably sufficient to compare customer numbers as they are unique
	 @Override
	 public boolean equals(Object obj)
	 {
		 Customer cObject;
		 if(obj instanceof Customer)
			 cObject = (Customer)obj;
		 else
			 return false;
		 return(this.number==(cObject.number));
	 }
	 
	 // Getters
	 public String getEmailAddress()
	 {
		 return this.emailAddress;
	 }
	 // Return customer number
	 // NO SET NUMBER as it is unique so we don't provide setNumber method
	 public int getNumber()
	 {
		 return this.number;
	 }
	 // Setters
	 public void setEmailAddress(String emailAddressIn)
	 {
		 this.emailAddress = emailAddressIn;
	 }
}
