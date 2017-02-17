package pl.kriss3.bcit;

import java.util.Calendar;

public class Person 
{
	private String firstName;
	private String lastName;
	private int yearOfBirth;
	private Gender pGender;
	
	public Person(String firstName, String lastName, int yearOfBirth, Gender pGender)
	{
		setFistName(firstName);
		setLastName(lastName);
		setYearOfBirth(yearOfBirth);
		setGender(pGender);
	}
	
	public String getFirstName()
	{
		return this.firstName;
	}
	
	public void setFistName(String value)
	{
		this.firstName = value.equals("") || value == null ? "John" : value; 
	}
	
	public String getLastName()
	{
		return this.lastName;
	}
	
	public void setLastName(String value)
	{
		this.lastName = value.equals("") || value == null ? "Doe" : value; 
	}
	
	public int getYearOfBirth()
	{
		return this.yearOfBirth;
	}
	
	public void setYearOfBirth(int value)
	{
		if(value > 0 && value < Calendar.getInstance().get(Calendar.YEAR))
			this.yearOfBirth = value;
	}
	
	public Gender getGender()
	{
		return this.pGender;
	}
	
	public void setGender(Gender value)
	{
		this.pGender = value;
	}
	
	//Public Methods:
	//example: “Tiger Woods is a Person. He was born in 1975.”
	public String getDetails()
	{	
		return String.format("%s is a %s. %s was born in %d.", getFullName(), this.getClass().getSimpleName(), getGenderIndicator(), yearOfBirth);
	}
	
	protected String getFullName()
	{
		return firstName + " " + lastName;
	}
	
	protected String getGenderIndicator()
	{
		String result = null;
		if(getGender() == Gender.MALE)
			result = "He";
		else
			result = "She";
		
		return result;
	}
}
