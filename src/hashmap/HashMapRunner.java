//$Id$
package hashmap;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HashMapRunner 
{

	public static void main(String[] args) 
	{
		
		       Scanner input=new Scanner( System.in );
		
		       HashMapLogic callLogic=new HashMapLogic();
		
		       
		       boolean condition=true;
		       
		       
		       while( condition )
		       {
		       
		                  System.out.println("Press 1-->Add Integer Keys and Integer Values to the HashMap\n"
		                  		           + "Press 2-->Add String Keys and String Values to the HashMap\n"
		                  		           + "Press 3-->Add Integer Keys and String Values to the HashMap\n"
		                  		           + "Press 4-->Add String Keys and Integer Values to the HashMap\n"
		       		                       + "Press 5-->Add null Keys to the HashMap\n"
		       		                       + "Press 6-->Add null Values to the HashMap\n"
		       		                       + "Press 7-->Print the size of the HashMap\n"
		       		                       + "Press 8-->Print the HashMap\n"
		       		                       + "other->exit");
		       
		       
		       
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
		          		                   input.nextLine();		       
		                  
		          		                   
		          	switch( option )	                   
		          	{
		          	
		          	      case 1:
		          	    	         
		          	    	  while( true )
		          	    	  {
		          	    	       try
		          	    	       {
		          	    	  
		          	    	               System.out.println(" Howmany Keys( Integers ) and Values( Integers )  pair to you want to put Map ");
		          	    	      
		          	    	               int count=input.nextInt();
		          	    	  
		          	    	               for( int i=0;i<count;i++ )
		          	    	               {
		          	    	            	   
		          	    	            	   int key,value=0;
		          	    	            	   
		          	    	            	   while( true )
		          	    	            	   {
		          	    	            		   
		          	    	            	      System.out.println( "Enter the Key" );
		          	    	            	      
		          	    	            	      try
		          	    	            	      {
		          	    	            	          key=input.nextInt();
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
		          	    	            		   
		          	    	            	      System.out.println( "Enter the Value" );
		          	    	            	      
		          	    	            	      try
		          	    	            	      {
		          	    	            	         value=input.nextInt();
		          	    	            	         break;
		          	    	            	      }
		          	    	            	      catch( InputMismatchException ex )
		       		          	    	          {
		       		          	    	    	      System.out.println("Enter Number Only");
		       		          	    	    	      input.nextLine();

		       		          	    	          }
		          	    	            	      
		          	    	            	      
		          	    	            	      
		          	    	            	      
		          	    	            	   }   
		          	    	            	   
		          	    	            	      callLogic.addToHashMap( key , value );
		          	    	            	   
		          	    	               }
		          	    	                
		          	    	               break;
		          	    	       }
		          	    	       catch( InputMismatchException ex )
		          	    	       {
		          	    	    	      System.out.println("Enter Number Only");
   		          	    	    	      input.nextLine();

		          	    	       }
		          	    	  
		          	    	  }	    
		          	                       break;
		          	            
		          	                       
		          	      case 7:
		          	    	  
		          	    	               System.out.println(" Size is :"+callLogic.sizeOfMap());
		          	    	               
		          	    	               break;
		          	                       
		          	                       
		          	      case 8:
		          	    	  
		          	    	               System.out.println( callLogic.getActualMap() );
		          	                       
		          	    	               break;
		          	             
		          	    	    
		          	      default:
		          	    	  
		          	    	               condition=false;
		          	
		          	
		          	}	                   
		          		                   
		          		                   
		          		                   
		                  
		                  
		       } 
		
		
	 	       input.close();

	}

}
