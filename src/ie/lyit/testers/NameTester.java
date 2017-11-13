package ie.lyit.testers;
import ie.lyit.Hotel.*;
import java.util.*;
public class NameTester
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		// Create a Name object called personA using default constructior -> null
		Name personA = new Name();
		// Display default personA on screen
		System.out.println(personA);
		// Set personA name
		personA.setTitile("Mr");
		personA.setFirstName("Homer");
		personA.setSurname("Simpson");
		// Display person A details on the screen
		System.out.println(personA);
		// Create two same objects for equal method test
		Name personB = new Name("Mr","Richard" , "Kuduk");
		Name personC = new Name("Mr","Robert" , "Robertson");
		// Call equals method
		if(personB.equals(personC))
			System.out.println(personB + " is the same as" + personC);
		else
			System.out.println(personB + " is not the same as " + personC);
		// Check for gender
		if(personB.isFemale())
			System.out.println(personA + "is a female.");
		else
			System.out.println(personB + " is not female.");
		
		// Create arrayList of names
		ArrayList<Name> names = new ArrayList<Name>();
		// Add objects
		names.add(new Name("Mr","Bart","Simpson"));
		names.add(personA);
		names.add(personB);
		names.trimToSize();
		// Display names in array list
		for(Name tempName : names)
			System.out.println(tempName);
		
		// Testing the name search method 
		if(nameSearch(personA,names))
			System.out.println("FOUND!");
		else
			System.out.println("NOT FOUND!");
	}
	
	public static boolean nameSearch(Name nameSearch , ArrayList<Name> listOfNames)
	{
		for(Name currentName : listOfNames)
			{
				if(currentName.equals(nameSearch))
					return true;
			}
			return false;
	}
		
	
	

}
