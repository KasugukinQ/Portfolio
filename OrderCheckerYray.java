import java.util.Scanner;
public class OrderCheckerYray 
{
	public static void main(String[] args) 
    {
		double bolt = 0.5;
		double nut = 0.3;
		double washer = 0.1;
		
		try (Scanner ask = new Scanner(System.in)) 
        {
            {
                System.out.print("The number of bolts: ");
                int abolt = ask.nextInt();
                System.out.print("The number of nuts: ");
                int bnut = ask.nextInt();
                System.out.print("The number of washers: ");
                int cwashers = ask.nextInt();
                		
                if  (bnut<abolt) 
                { 
                	System.out.println("Check the order: too few nuts"); 
                }
                else if (cwashers<abolt) 
                { 
                	System.out.println("Check the order: too few washer"); 
                }
                else
                { 
                	System.out.println("Check the order: Order is ok"); 
                }
                		
                double totalcost = (abolt*bolt) + (bnut*nut) + (cwashers*washer);
                		
                System.out.println("Total cost: "+ totalcost);
            }
        }
		
	}
}
