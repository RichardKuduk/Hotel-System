package ie.lyit.Hotel;

public abstract class Person {
	protected Name name ; // COMPOSITION = Person HAS-A name
	protected String address;
	protected String phoneNumber;
	
	// Default constructor
	// Called when object is created like this
	// --> Person personA = new Person();
	// NOTE => This wont work because PErson is ABSTRACT 
	public Person()
	{
		name = new Name();
		address = null;
		phoneNumber = null;
	}
	// Initialization Constructor
	public Person(String titleIn , String firstNameIn , String surnameIn , String addressIn , String phoneNumberIn)
	{
		name = new Name(firstNameIn,surnameIn,addressIn); // Calls name Initialization constructor
		this.address = addressIn;
		this.phoneNumber = phoneNumberIn;
		
	}
	
	// toString method
	public String toString()
	{
		return name + "," + address + "," + phoneNumber;
	}
	// EQuals method
	@Override
	public boolean equals(Object obj)
	{
		Person pObject;
		if(obj instanceof Person)
			pObject = (Person)obj;
		else
			return false;
		return(name.equals(pObject.name) &&
				address.equals(pObject.address) &&
				phoneNumber.equals(pObject.phoneNumber));
	}
	
	// Setters
	
	public void setName(Name nameIn)
	{
		name = nameIn;
	}
	public void setAddress(String addressIn)
	{
		this.address = addressIn;
	}
	public void setPhoneNumber(String phoneNumberIn)
	{
		this.phoneNumber = phoneNumberIn;
	}
	
	// Getters
	
	public Name getName()
	{
		return name;
	}
	public String getAddress()
	{
		return this.address;
	}
	public String getPhoneNumber()
	{
		return this.phoneNumber;
	}
}
