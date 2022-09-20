//$Id$
package queue;

import java.util.InputMismatchException;
import java.util.Scanner;

import utility.CustomException;
import utility.Utility;

public class QueueRunner 
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
		
		   
		   QueueLogic callLogic=new QueueLogic();
		   
		   boolean condition=true;
		   
		   
		   while( condition )
		   {
			   
		                   System.out.println( "Press 1-->Add Strings to Queue using add() method\n"		   		                             
		   		                             + "Press 2-->Add Strings to Queue using offer() method\n"    
		   		                             + "Press 3-->Retrive and doesn't remove first element using element() "
		   		                             + "method\n"
		   		                             + "Press 4-->Retrive and doesn't remove first element using peek() method\n"
		   		                             + "Press 5-->Retrive and remove first element using remove() method\n"
		   		                             + "Press 6-->Retrive and remove first element using poll() method\n"
		   		                             + "Press 7-->Print the size of Queue\n"
		   		                             + "Press 8-->Print the Queue\n"
		   		                             + "other-->exit" );
		   
		                 
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
	                		                              int count=getInt( input , "How many Strings you want" );
	                		           
	                		                              Utility.numberCheck( count );

	                		                              for( int i=0;i<count;i++ )
	                		                              {
	                		            	                     callLogic.add( getString( input  ) );
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
	                		            	                     callLogic.offer( getString( input  ) );
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
		                            	    	
		                            	         System.out.println( callLogic.element()  );
		                            	   
		                            	    }
		                            	    catch( CustomException ex )
		                            	    {
		                            	    	
		                            	    	System.out.println( ex.getMessage() );
		                            	    	
		                            	    }
		                            	 
		                            	 
		                            	    break;
		                            	    
		                            	    
		                             case 4:                 
		      		                   
		      		                   
		                            	    System.out.println( callLogic.peek()  );
		                            	 
		                            	 
		                            	 
		                            	    break;	    
		                            	    
		                             case 5:
		                            	    
		                            	    try
		                            	    {
		                            	    	
		                            	        System.out.println( callLogic.remove() ); 
		                            	 
		                            	    }
		                            	    catch( CustomException ex )
		                            	    {
		                            	    	System.out.println( ex.getMessage() );
		                            	    }
		                            	    
		                            	    break;
		                            	    
		                            	    
		                             case 6:
		                            	 
		                            	 
		                            	   System.out.println( callLogic.poll() );
		                            	   
		                            	   break;
		                            	    
		                            	 
		                             case 7:
		                            	 
		                            	 
		                            	    System.out.println( "Size : "+callLogic.sizeOfQueue() );
		                            	 
		                            	    break;   
		                            	
		                            	    
		                             case 8:
		                            	 
		                            	    System.out.println( callLogic.getActualQueue() );
		                            	    
		                            	    break;
		                            	    

		                             default:
		                            	 
		                            	 
		                            	 
		                            	    condition=false;
		                            	  
		                   
		                   
		                   }
		                                
		                                
		                 
		                 
		                 
		                 
		   }
		
		   input.close();

	}

}
