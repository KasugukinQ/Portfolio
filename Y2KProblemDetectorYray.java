/*
------------------------------------------------------------------------------------------------
Patrick Dharren Yray BSIT-1E
Y2K Problem Detector
------------------------------------------------------------------------------------------------
*/
import java.util.Scanner;

public class Y2KProblemDetectorYray 
{
	public static void main(String[] args) 
    {
		int yearofbirth,currentyear, age;
		try (Scanner ask = new Scanner(System.in)) 
        {
            System.out.print("Year of the birth: ");
            yearofbirth = ask.nextInt();
            
            System.out.print("Current year: ");
            currentyear = ask.nextInt();
        }
		if  (currentyear<yearofbirth) 
        {
			age = currentyear=100 - (yearofbirth - currentyear);
		}
        else 
        {
			age = currentyear - yearofbirth;
		}
		System.out.print("Your age: " + age);
	}
}