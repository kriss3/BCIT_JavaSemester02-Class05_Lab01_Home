/**
 * 
 */
package pl.kriss3.bcit;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author Krzysztof Szczurowski
 * @see https://github.com/kriss3/BCIT_JavaSemester02-Class05_Lab01_Home.git
 * @since 2017-02-10
 */
public class School
{	
	private Person president;
	private HashMap<String, Student> students;
	
	public School()
	{
		
		generatePeople();
		run();
	}
	
	private void run()
	{
		
		System.out.println("#######################################");
		System.out.println("####   List of People at a School   ###");
		System.out.println("#######################################");
		System.out.println();
		
		System.out.println(president.getDetails());
		System.out.println();
		int count = 1;
		
		for(Map.Entry<String, Student> entry : students.entrySet())
		{
			System.out.println(count + "." + entry.getValue().getDetails());
			System.out.println();
			count++;
		}
	}
	
	private void generatePeople()
	{
		/*	“Oprah Winfrey is a Person. She was born in 1954.”
		 *	“Tiger Woods is a Person. He was born in 1975.”
		 * 	[S] “Mark Zuckerberg is a Student of computer science (st# 12345678). He was born in 1984.”
		 * 	[S] “Michelle Obama is a Student of law (st# 98765432). She was born in 1964.”
		 * 	[S] “Markus Frind is a BCITStudent of computer science (st# A12345678) at the Downtown campus. He was born in 1979.”
		 * 	[S] “Gloria Macarenko is a BCITStudent of journalism (st# A88877777) at the Burnaby campus. She was born in 1962.”
		 */
		
		president = new Person("Kathy","Kinloch", 1960, Gender.FEMALE);
		
		students = new HashMap<>();
		
		students.put("00001", new Student("Tony","Hawk",1968 ,Gender.MALE, "00001", "Physical Education", 4.0));
		students.put("00002", new BCITStudent("Stanislaw","Ulam",1909,Gender.MALE, "00002", Campus.RICHMOND, "Mathematics", 4.0));
		
		students.put("12345678", new Student("Mark","Zuckerberg",1984,Gender.MALE, "12345678", "Computer Science", 3.0));
		students.put("98765432", new Student("Michelle","Obama",1964,Gender.FEMALE, "98765432", "Law", 4.5));
		
		students.put("A12345678", new BCITStudent("Markus", "Frind", 1979, Gender.MALE, "A12345678", Campus.DOWNTOWN, "Computer Science", 3.6));
		students.put("A88877777", new BCITStudent("Gloria", "Macarenko", 1962, Gender.FEMALE, "A88877777", Campus.BURNABY, "Jurnalisim", 3.6));
		
	}
		
}
