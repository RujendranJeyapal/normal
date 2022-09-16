//$Id$
package arraylist;


import java.util.InputMismatchException;
import java.util.Scanner;

import utility.CustomException;
import utility.Utility;

public class ArrayListRunner 
{

	public static void main(String[] args) 
	{
		
		        Scanner input=new Scanner( System.in );
		
		        ArrayListLogic callLogic=new ArrayListLogic();
		        
		        boolean condition=true;
		        
		        
		        while( condition )
		        {
		        	
		        
		                System.out.println("Press 1-->Add Strings to ArrayList\n"
				                         + "Press 2-->Add Integers to ArrayList\n"
				                         + "Press 3-->Add String to ArrayList given Position\n"
				                         + "Press 4-->Add Integer to ArrayList given Position\n"
				                         + "Press 5-->Add Two Lists\n"
				                         + "Press 6-->Add Two Lists in Given Index\n"
				                         + "Press 7-->Get Sub List\n"
				                         + "Press 8-->Remove the element "
				                         + "from the first ArrayList which are present in second arraylist\n"
				                         + "Press 9-->Remove the element from the fist "
				                         + "ArrayList which aren't present in 2nd ArrayList\n"
				                         + "Press 10-->Get the index of the Given Element\n"
				                         + "Press 11-->Get the last index of the Given Element\n"
				                         + "Press 12-->Get the Element of the given index\n"
				                         + "Press 13-->Remove the index\n"
				                         + "Press 14-->Remove the Element(String)\n"
				                         + "Press 15-->Check whether the element is Exist\n"
				                         + "Press 16-->Print the size of ArrayList\n"
				                         + "Press 17-->Print the ArrayList\n"
				                         + "Press 18-->Clear the ArrayList\n"
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
        		                   input.nextLine();	
        		                   
        		                   
        		        switch( option ) 
        		        {
        		        
        		             case  1:
        		                	
        		                	while( true )
        		                	{
        		                		
        		                		
        		                		   System.out.println( "How many Strings you want" );
        		                		   
        		                		   try
        		                		   {
        		                		           int count=input.nextInt();
        		                		           
        		                		           Utility.numberCheck( count );
        		                		           
        		                		           input.nextLine();
        		                		           
        		                		           String array[]=new String[ count ];
        		                		           
        		                		           System.out.println("Enter the Strings");
        		                		           
        		                		           for( int i=0;i<count;i++ )
        		                		           {
        		                		        	    array[i]=input.nextLine();
        		                		           }
        		                		           
        		                		           callLogic.addToArrayList( array );
        		                		           
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
        		                	  
        		                	  
                           case  2:
        		                	
        		                	while( true )
        		                	{
        		                		
        		                		
        		                		   System.out.println( "How many Integers you want" );
        		                		   
        		                		   try
        		                		   {
        		                		           int count=input.nextInt();
        		                		           
        		                		           Utility.numberCheck( count );
        		                		           
        		                		           input.nextLine();
        		                		           
        		                		           Integer array[]=new Integer[ count ];
        		                		           
        		                		           System.out.println("Enter the Integers");
        		                		           
        		                		           for( int i=0;i<count;i++ )
        		                		           {
        		                		        	 
        		                		        	   while( true )
        		                		        	   {   
        		                		        	           try
        		                		        	           {
        		                		        	   
        		                		        	                  array[i]=input.nextInt();
        		                		        	                  
        		                		        	                  break;
        		                		        	           }
        		                		        	           catch( InputMismatchException ex )
        		        		                	           {
        		        		                			          System.out.println("Enter Number Only");
        		        		                			          input.nextLine();
        		        		                		       }
        		                		        	   }
        		                		        	        
        		                		           }
        		                		           
        		                		           callLogic.addToArrayList( array );
        		                		           
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
                                	
                                	int index;	
                                	
                                	System.out.println("Enter the Index"); 
                                	
                                   while( true )	
                                   {	 
                                		 
                                         
                                     	try 
							            {
                                	
                                	         index=input.nextInt();
							                 Utility.indexCheckForArrayList( callLogic.sizeOfArrayList() , index);
							                 input.nextLine();
	                                	     
							                 break;
							            }  
							            catch (CustomException ex) 
							            {
							                 System.out.println( ex.getMessage() );
							            }
							            catch( InputMismatchException ex )
  		                		        {
  		                			         System.out.println("Enter Number Only");
  		                			         input.nextLine();
  		                		        }
                                	 
                                  }	
                                
                                
                                
                                      System.out.println("Enter the String");
                                
                                      String inputString=input.nextLine();
                                      
                                      callLogic.addToArrayListGivenPosition( index , inputString );
                                
                                	  break;
                                	  
                                	  
        		        
                                	  
                          case 4:
                                	
                                	
                                    int index4,number;	
                                	
                                	System.out.println("Enter the Index"); 
                                	
                                    while( true )	
                                    {	 
                                		 
                                         
                                     	try 
							            {
                                	
                                	         index4=input.nextInt();
							                 Utility.indexCheckForArrayList( callLogic.sizeOfArrayList() , index4);
							                 input.nextLine();
	                                	     
							                 break;
							            }  
							            catch (CustomException ex) 
							            {
							                 System.out.println( ex.getMessage() );
							            }
							            catch( InputMismatchException ex )
  		                		        {
  		                			         System.out.println("Enter Number Only");
  		                			         input.nextLine();
  		                		        }
                                	 
                                  }	
                                
                                
                                
                                      System.out.println("Enter the Integer");
                                
                                  while( true )    
                                  {
                                	  
                                        try
                                        {
                                              number=input.nextInt();
                                              break;
                                        }  
                                        catch( InputMismatchException ex )
		                		        {
		                			          System.out.println("Enter Number Only");
		                			          input.nextLine();
		                		        }
                                  }  
                                      callLogic.addToArrayListGivenPosition( index4 , number );
                                
                                	  
                                	
                                	  break;
                                	  
                          case 5:
                                	
                                	  callLogic.addTwoLists( callLogic.getArrayListWithObjects()  );
                                	
                                	
                                	  break;
                                	  
        		               
                                	  
                          case 6:
                          	
                          	
                                  int index6;	
                          	
                          	       System.out.println("Enter the Index"); 
                          	
                                   while( true )	
                                   {	 
                          		 
                                   
                               	           try 
						                   {
                          	
                          	                  index6=input.nextInt();
						                      Utility.indexCheckForArrayList( callLogic.sizeOfArrayList() , index6);
						                      input.nextLine();
                              	     
						                      break;
						                   }  
						                   catch (CustomException ex) 
						                   {
						                      System.out.println( ex.getMessage() );
						                   }
						                   catch( InputMismatchException ex )
	                		               {
	                			               System.out.println("Enter Number Only");
	                			               input.nextLine();
	                		               }
                          	 
                                   }	
                          
                          
                          
                                    callLogic.addListToIndexOfAnotherList( index6 , callLogic.getArrayListWithObjects() );
                          
                          	  
                          	
                          	  break;    	  
                                	  
                                	  
                                	  
                          case 7:
                                	
                                 while( true )
                                 {
                            	   
                                	 int startingPosition,endingPosition;
                                 	
                                	 System.out.println("Enter the starting position");
                                	 
                                	 while( true )
                                	 {	 
                                		 
                                	     try
                                	     {
                                	           startingPosition=input.nextInt();
                                	           Utility.indexCheckForArrayList( callLogic.sizeOfArrayList() , startingPosition );
                                	           break;
                                	     }
                                	     catch (CustomException ex) 
 							             {
 							                 System.out.println( ex.getMessage() );
 							             }
 							             catch( InputMismatchException ex )
   		                		         {
   		                			         System.out.println("Enter Number Only");
   		                			         input.nextLine();
   		                		         }
                                	 
                                	 }    
                                	     
                                	 System.out.println("Enter the ending position");
                                	 
                                	 while( true )
                                	 {	 
                                		 
                                	     try
                                	     {
                                	           endingPosition=input.nextInt();
                                	           Utility.indexCheckForArrayList( callLogic.sizeOfArrayList() , endingPosition );
                                	           break;
                                	     }
                                	     catch (CustomException ex) 
 							             {
 							                 System.out.println( ex.getMessage() );
 							             }
 							             catch( InputMismatchException ex )
   		                		         {
   		                			         System.out.println("Enter Number Only");
   		                			         input.nextLine();
   		                		         }
                                	 
                                	 }
                                	 
                                	     try
                                	     {
                                	         System.out.println( callLogic.getSubList( startingPosition, endingPosition ) );
                                	         break;
                                	     }  
                                	     catch (CustomException ex) 
 							             {
 							                 System.out.println( ex.getMessage() );
 							             }
                                	
                               }	
                                	 break;
                                	  
                                	
                           case 8:  
                        	   
                        	          callLogic.removeAllObjects( callLogic.getArrayListWithObjects() ) ;     
                        	   
                        	          break;
                           
                           case 9:
                        	   
                        	          callLogic.retainAllObjects( callLogic.getArrayListWithObjects() );
                        	          
                        	          break;
                                
                        	
                           case 10:
                        	   
                        	          System.out.println("Enter the Object(String)");
                        	          
                        	          String inputString10=input.nextLine();
                        	          
                        	          int index10=callLogic.getIndexOfObject( inputString10 );
                        	          
                        	          if( index10==-1 )
                        	          {
                        	        	  System.out.println("Doesn't exist");
                        	          }
                        	          
                        	          else
                        	          {
                        	        	  System.out.println(index10);
                        	          }
                        	          
                        	   
                        	          break;
                        	          
                           case 11:
                        	   
                 	                  System.out.println("Enter the Object(String)");
                 	          
                 	                  String inputString11=input.nextLine();
                 	          
                 	                  int index11=callLogic.getLastIndexOfObject( inputString11 );
                 	          
                 	                  if( index11==-1 )
                 	                  {
                 	        	          System.out.println("Doesn't exist");
                 	                  }
                 	          
                 	                  else
                 	                  {
                 	        	          System.out.println(index11);
                 	                  }
                 	          
                 	   
                 	                  break;          
                         	  
                 	                  
                           case 12:
                        	   
                        	         System.out.println("Enter the index");
                        	         
                        	         int index12;
                        	        
                        	      while( true )
                        	      {
                        	    	  
                        	            try
                        	            {                     	         
                        	                 index12=input.nextInt();
                        	                 
                        	                 
                        	                  
                        	                 
                        	                  
                        	                  System.out.println( callLogic.getObject( index12 )  );
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
                        	         
                        	         
                          case 13:
                        	   
                  	                   System.out.println("Enter the index to remove");
                  	         
                  	                   int index13;
                  	        
                  	                   while( true )
                  	                   {
                  	    	  
                  	                        try
                  	                        {   
                  	                        	
                  	                            index13=input.nextInt();
                  	                            
                  	                             callLogic.removePosition( index13 );  ;
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
                        	         
                  	         
                  	         
                          case 14:
                        	  
                        	  
                                      System.out.println("Enter the Object(String) to remove");     
                                      
                                      String removeString=input.nextLine();
                                      
                                      callLogic.removeObject( removeString );
                        	  
                        	  
                        	      
                        	          break;
                  	         
                        	          
                          case 15:
                        	  
                        	         System.out.println( "Enter the Object(String) to Check " );
                        	         
                        	         String checkString=input.nextLine();
                        	         
                        	         System.out.println( callLogic.isExist( checkString ) );
                        	         
                        	         break; 
                        	          
                                	 
                           case 16:
                                	
                                	  System.out.println( "Size :"+callLogic.sizeOfArrayList() );
        		                	  
                                	  break;
                                	  
                                	  
                           case 17:
                                	 
                                	 System.out.println( callLogic.getActualList() );
                                	 
                                	 break;
                                	
                           case 18:
                        	   
                        	         callLogic.clearArrayList();
                        	   
                        	         break;
                                	 
        		        
        		           default:
        		                	
        		                	  condition=false;
        		        
        		        }
		
        		                   
		        }                  
		
		        input.close();

	}

}
