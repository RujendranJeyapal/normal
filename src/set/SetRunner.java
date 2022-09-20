//$Id$
package set;


import java.util.InputMismatchException;
import java.util.Scanner;

import utility.CustomException;
import utility.Utility;


public class SetRunner 
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
		
		SetLogic callLogic=new SetLogic();
		
		
		boolean condition=true;
		
		
		    while( condition )
		    {
		    	
		            System.out.println(  "Press 1-->Add String to the Set\n"
				                       + "Press 2-->Add Integers to the Set\n"
				                       + "Press 3-->Add another Set to Set\n"
				                       + "Press 4-->Add List to Set\n"
				                       + "Press 5-->Remove element from Set\n"
				                       + "Press 6-->Remove all Set element from the Set\n"
				                       + "Press 7-->Remove all List element from the Set\n"
				                       + "Press 8-->Retain all Set element from the Set\n"
				                       + "Press 9-->Retail all List element from the Set\n"
				                       + "press 10-->Size of the Set\n"
				                       + "Press 11-->Get the Array of the Set\n"
				                       + "others-->exit" );
		
		
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
		                		            	   callLogic.addElementsToSet( getString( input  ) );
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
		                		                 int count=getInt( input , "How many Integers you want" );
		                		             
		                		                 Utility.numberCheck( count );

		                		                 System.out.println("Enter the Integers");
		                		           
		                		                 for( int i=0;i<count;i++ )
		                		                 {
		                		        	 
		                		        	           while( true )
		                		        	           {   
		                		        	                 try
		                		        	                 {
		                		        	                        callLogic.addElementsToSet( getInt( input , "Integer "+(i+1) ) ) ;       
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
                        	
                                        
                                        
                           case 3:
                        	   
                        	           System.out.println( callLogic.addCollectionsToSet( callLogic.getSetWithElements()  ) );
                        	           
                        	           break;
                                   
                        	           
                        	           
                           case 4:	           
                        	           
                        	           System.out.println( callLogic.addCollectionsToSet( callLogic.getListWithElements() )  );
                        	           
                        	           break;
                        	           
                        	
                           case 5:           
                        	   
                        	    
                        	           System.out.println(  callLogic.remove(  getString( input ) )  );
                        	           
                        	           break;
                        	           
                        	           
                           case 6:
                        	   
                        	          System.out.println( callLogic.removeAll( callLogic.getSetWithElements()  )  );
                        	          
                        	          break;
                        	          
                        	          
                           case 7:
                        	   
                 	                   System.out.println( callLogic.removeAll( callLogic.getListWithElements()  )  );
                 	          
                 	                   break;          
                        	     
                 	                   
                           case 8:
                        	   
                        	           System.out.println( callLogic.retainAll( callLogic.getSetWithElements() ) );
                 	                   
                 	                   break;
                 	                   
                 	                   
                 	                   
                           case 9:
                        	   
                        	           System.out.println( callLogic.retainAll( callLogic.getListWithElements() )  );
                        	           
                        	           break;
                 	                   
                        	           
                           case 10:
                        	   
                        	   
                        	           System.out.println( "Size : "+callLogic.sizeOfSet() );
                                       
                        	           break;
                                     
                           case 11:
                        	                         	         
                        	         
                        	           for( Object temp : callLogic.toArray()  )
                        	           {
                        	        	    System.out.println( temp );
                        	           }
                        	         
                                       break;
                           default:
                        	   
                        	          condition=false;
                                     
        
                   }
		
		
		    }
		input.close();
		
	}

}
