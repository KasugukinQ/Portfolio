/*
------------------------------------------------------------------------------------------------
Patrick Dharren Yray BSIT-1E
BSIT-1E
------------------------------------------------------------------------------------------------
*/

import java.util.Scanner;

public class MatineeMovieTicketYray
{
   public static void main(String[] args) 
   {
      int matineeage, matineetime;
      
      System.out.println("Enter Age: ");
      try (Scanner in = new Scanner(System.in)) 
		{
			matineeage = in.nextInt();
		  
		        
		    if (matineeage > 13) 
			{
		    	System.out.println("Enter Time: ");
		    	matineetime = in.nextInt();
		        
		        if (matineetime < 1700) 
				{
		           System.out.println("Ticket Price is: $5.00");
		        }
				else 
				{
		           System.out.println("Ticket Price is: $8.00");
		        }
		  }
		  else 
		  	{	
		    	System.out.println("Enter Time: ");
		    	matineetime = in.nextInt();
		        	if (matineetime < 1700) 
					{
		           		System.out.println("Ticket Price is: $2.00");
		        	}
					else
					{
		    		   System.out.println("Ticket Price is: $4.00");
		        	}
		  }	
		}
   }
}