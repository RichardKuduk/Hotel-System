package ie.lyit.testers;
import ie.lyit.Hotel.Customer;
import ie.lyit.Hotel.Name;
public class CustomerTester {
	
	public static void main(String args [])
	{
		// Create Customer object
		Customer customerA = new Customer();
		// Display Customer 
		System.out.println(customerA);
		
		// Set customer details
		customerA.setName(new Name("Mr", "Homer","Simpson"));
		customerA.setAddress("12 Hi Road,Letterkenny");
		customerA.setPhoneNumber("0877777");
		customerA.setEmailAddress("homer@hotmail.com");
		// Display 
		System.out.println(customerA);
		
	}

}
