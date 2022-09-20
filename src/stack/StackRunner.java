//$Id$
package stack;

import java.util.InputMismatchException;
import java.util.Scanner;

import utility.CustomException;
import utility.Utility;

public class StackRunner
{

	
	static Object getString( Scanner input  )
	{
		System.out.println("Enter the Object(String)");
		
		return input.nextLine();
		
	}
	
	
	
	
	
	static int getInt( Scanner input , String sentence )
	{
		
        System.out.println(sentence);
		
		int result= input.nextInt();
		
		input.nextLine();
		
		return result;
		
	}
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) 
	{
		  Scanner input=new Scanner( System.in );
		
		  StackLogic callLogic=new StackLogic();
		
		   
		  boolean condition=true;
		
		  while( condition )
		  {
		  
		        System.out.println("Press 1-->Push Integers to Stack\n"
				                 + "Press 2-->Push Strings to Stack\n"
				                 + "Press 3-->Peek elements from Stack\n"
				                 + "Press 4-->Pop elements from Stack\n"
				                 + "Press 5-->Check whether the Stack in empty\n"
				                 + "Press 6-->Search the Element\n"
				                 + "Press 7-->Size of the Stack\n"
				                 + "Press 8-->Print the Stack\n"
				                 + "others-->exit");
		

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
				                		              int count=getInt( input , "How many Integers you want" );
				                		           
				                		              Utility.numberCheck( count );
   
				                		              System.out.println("Enter the Integers");
				                		           
				                		              for( int i=0;i<count;i++ )
				                		              {
				                		        	 
				                		        	        while( true )
				                		        	        {   
				                		        	              try
				                		        	              {
				                		        	                     callLogic.push( getInt( input , "Integer "+(i+1) ) ) ;       
				                		        	                     break;
				                		        	              }
				                		        	              catch( InputMismatchException ex )
				        		                	              {
				        		                			             System.out.println("Enter Number Only");
				        		                			             input.nextLine();
				        		                		          }
				                		        	        }
				                		        	        
				                		              }
 
				                		                break;
				                		         }
				                		         catch( CustomException ex )
				     			                 {
				     			                        System.out.println(ex.getMessage());
				     			                 }
				                		         catch( InputMismatchException ex )
				                		         {
				                			            System.out.println("Enter Number Only");
				                			            input.nextLine();
				                		         }
				                		   
				                		   
				                	       }

				                	       break;   
		        
				                	       
		                     case 2:   	       
				                	       
		                    	 
		                    	          while( true )
				                	      {

				                		         try
				                		         {
				                		               int count=getInt( input , "How many Strings you want" );
				                		           
				                		               Utility.numberCheck( count );

				                		               for( int i=0;i<count;i++ )
				                		               {
				                		            	   callLogic.push( getString( input  ) );
				                		               }
				                		           

				                		               break;
				                		         }
				                		         catch( CustomException ex )
				     			                 {
				     			                       System.out.println(ex.getMessage());
				     			                 }
				                		         catch( InputMismatchException ex )
				                		         {
				                			           System.out.println("Enter Number Only");
				                			           input.nextLine();
				                		         }
				                		   
				                		   
				                	      }
				        
				                	
				                	
				                	      break;
   
				                	      
				                	      
		                     case 3:
		                    	 
		                    	          try 
		                    	          {		                    	 
		                    	                 System.out.println( callLogic.peek() );  
		                    	          }
		                    	          catch( CustomException ex ) 
		                    	          {
		                    	        	     System.out.println( ex.getMessage() );
		                    	          }
		                    	           
		                    	          break;
				                	 
		                    	          
		                     case 4:
		                    	          
		                    	         try
		                    	         {
		                    	                 System.out.println(  callLogic.pop() );
		                    	         }
		                    	         catch( CustomException ex ) 
		                    	         {
		                    	        	     System.out.println( ex.getMessage() );
		                    	         }
		                    	         
		                    	         break;
		               
		                     case 5:   	       
				             
		                    	          
		                    	          System.out.println(  callLogic.isStackEmpty() ); 
		                    	 
		                    	          break;
		                    	          
		                    	          
		                    	          
		                     case 6:
		                    	 
		                    	          int result=callLogic.searchObject(  getString( input ) ) ;
		                    	 
		                    	          if( result==-1 )
		                    	          {
		                    	              System.out.println( "This elemnt doesn't exist in the stack" ); 
		                    	          }
		                    	          else
		                    	          {
		                    	        	  System.out.println("This element is exist in the Stack ");
		                    	          }
		                    	          
		                    	          
		                    	          
		                    	          
		                    	          break;
		         
		                     case 7:     	       
				                       
		                    	          System.out.println( "Size "+callLogic.sizeOfStack() );
		                    	 
		                    	          break;
				                	     
		                     case 8:	          
		                    	        
		                    	           System.out.println(  callLogic.getActualStack() );
		                    	           
		                    	           break;
		                    	          
		        
		                     default:
		                    	 
		                    	           condition=false;
		         
		 
		        }
		                   
		                   
		                   
		  }              
		
		input.close();

	}

}
