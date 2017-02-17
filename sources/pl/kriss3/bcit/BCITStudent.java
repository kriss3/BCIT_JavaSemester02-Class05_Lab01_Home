package pl.kriss3.bcit;

/**
 * @author Krzysztof Szczurowski
 * @see https://github.com/kriss3/BCIT_JavaSemester02-Class05_Lab01_Home.git
 * @since 2017-02-10
 */
public class BCITStudent extends Student 
{
	private String bcitStudentNumber;
	private Campus sCampus;
	
	
	public BCITStudent(String firstName, String lastName, int yearOfBirth, Gender sGender, String bcitStudentNumber, Campus sCampus, String major, double sGpa)
	{
		super(firstName, lastName, yearOfBirth, sGender, null, major, sGpa);
		setCampus(sCampus);
		setBCITStudentNumber(bcitStudentNumber);
	}
	
	public String getBCITStudentNumber()
	{
		return this.bcitStudentNumber;
	}
	
	public void setBCITStudentNumber(String value)
	{
		String prefix = "A";
		this.bcitStudentNumber = value == null || value.equals("") ? prefix + "000000" : prefix + value; 
	}

	public Campus getsCampus() 
	{
		return sCampus;
	}

	public void setCampus(Campus sCampus) 
	{
		this.sCampus = sCampus;
	}
	
	//“Gloria Macarenko is a BCITStudent of journalism (st# A88877777) at the Burnaby campus. She was born in 1962.”
	public String getDetails()
	{
		return String.format("%s is a %s of %s (Student#: %s) at the %s campus. %s was born in %d.", super.getFullName(), this.getClass().getSimpleName(), 
				super.getMajor(), bcitStudentNumber, sCampus, super.getGenderIndicator(), super.getYearOfBirth());
	}
}
