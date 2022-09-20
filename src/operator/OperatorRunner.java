//$Id$
package operator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class OperatorRunner 
{

	public static void main(String[] args) 
	{
		Scanner input=new Scanner( System.in );
		
		OperatorLogic callLogic=new OperatorLogic();
		
		boolean condition=true;
		
		int firstNo=0;
		
		int secondNo=0;
		
		
  	  
		while( true )
	    {
			
			    System.out.println("Enter the first Number");
			    
            	try
	            {
            		firstNo=input.nextInt();
	                break;
	            }
	            catch( InputMismatchException ex )
	            {
		           System.out.println("Enter Number Only");
		           input.nextLine();
	            }
	  
	    }
		
  	     
  	 
  	    
  	  
  	    
  	     
  	    while( true )
	    {
  	    	
  	         	System.out.println("Enter the second Number");
  	         	
           	    try
	            {
           	       secondNo=input.nextInt();
	               break;
	            }
	            catch( InputMismatchException ex )
	            {
		           System.out.println("Enter Number Only");
		           input.nextLine();
	            }
	  
	    }
  	     
		
		while( condition )
		{
			
		    System.out.println("Press 1-->+ Operation\n"
				         + "Press 2-->- Operation\n"
				         + "Press 3-->* Operation\n"
				         + "Press 4-->/ Operation\n"
				         + "Press 5-->% Operation\n"
				         + "Press 6-->find maximum\n"
				         + "other-->exit");
		
		    int option=0;
		
		    while( true )
		    {
	            	try
		            {
		               option=input.nextInt();
		               break;
		            }
		            catch( InputMismatchException ex )
		            {
			           System.out.println("Enter Number Only");
			           input.nextLine();
		            }
		  
		    }	
		      
		    
		 
		switch( option )
		{
		         
		     case 1:
		    	 
		    	  System.out.println("Addition is:"+callLogic.add(firstNo, secondNo));
		    	  
		    	  
		    	  break;
		    	  
		     case 2:
		    	 
		    	  System.out.println("Subraction is:"+callLogic.sub(firstNo, secondNo));
		    	  
		    	  break;
		    	  
		     case 3:
		    	 
		    	  System.out.println("Multiplication is:"+callLogic.mul(firstNo, secondNo));
		    	  
		    	  break;
		    	  
		     case 4:
		    	 
		    	  System.out.println("Division is:"+callLogic.div(firstNo, secondNo));
		    	  
		    	  break;
		    	  
		     case 5:
		    	 
		    	  System.out.println("Modulo is:"+callLogic.mod(firstNo, secondNo));
		    	  
		    	  break;	  
		    	 
		     case 6:

		    	  System.out.println( "Maximum is:"+callLogic.getMaximum( firstNo,secondNo ) );
		    	 
		    	  break;
		    	 
		     default:
		    	
		    	   condition=false;
		
		
		}
		   
	  }	
		
		input.close();

	}

}
