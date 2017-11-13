package ie.lyit.Hotel;

public class Name
{
	
	// Variables
	private String title;
	private String firstName;
	private String surname;
	// Default Constructor	
	public Name()
	{
		title=firstName=surname=null;
	}
	// Initialization Constructor
	public Name(String titleIn , String firstNameIn , String surnameIn)
	{
		title = titleIn;
		firstName = firstNameIn;
		surname = surnameIn;
	}
	// Return string representation of object
	public String toString()
	{
		return title + " " + firstName + " " + surname;
	}
	// Equals method
	@Override
	public boolean equals(Object obj)
	{
		Name nObject;
		if(obj instanceof Name)
			nObject = (Name)obj;
		else
			return false;
		
		return this.title.equals(nObject.title)
				&& this.firstName.equals(nObject.firstName)
				&& this.surname.equals(nObject.surname);

	}
	// Return true if Female method
	public boolean isFemale()
	{
		if(title.equalsIgnoreCase("Miss") || 
		   title.equalsIgnoreCase("Ms") ||
		   title.equalsIgnoreCase("Mrs"))
			return true;
		else 
			return false;
	}
	// Setters
	public void setTitile(String titleIn)
	{
		title = titleIn;
	}
	public void setFirstName(String firstNameIn)
	{
		firstName = firstNameIn;
	}
	public void setSurname(String surnameIn)
	{
		surname = surnameIn;
	}
	//Getters
	public String getTitle()
	{
		return title;
	}
	public String getFirstName()
	{
		return firstName;
	}
	public String getSurname()
	{
		return surname;
	}
}
