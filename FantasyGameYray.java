import java.util.Scanner;
public class FantasyGameYray 
{
	public static void main(String[]args) 
    {
        String CharacterName;
		int Luck, Strength, Hitpoints;
		
		try (Scanner ask = new Scanner(System.in)) 
        {
            System.out.println("Welcome to Yertle's Quest");
            System.out.print("Enter your character name: ");
            CharacterName = ask.nextLine();
            System.out.print("Enter Strength (1-10):");
            Strength = ask.nextInt();
            System.out.print("Enter Health (1-10):");
            Hitpoints = ask.nextInt();
            System.out.print("Enter Luck (1-10):");
            Luck = ask.nextInt();
        }
		
		if(Strength+Hitpoints+Luck>15) 
        {
			System.out.println("You have give your character too many points!");
			System.out.println("Default values have been assigned: ");
			System.out.println(CharacterName + ", Strength: 5, Health: 5, Luck: 5");
		}
        else 
        {
			System.out.println("Well done distributing your points!");
			System.out.println("Your characters stats: ");
			System.out.println(CharacterName + ", Strength: " + Strength + " , Health: " + Hitpoints + " , Luck: " + Luck);
		}
	}
}
