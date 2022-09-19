//$Id$
package arraylist;


import java.util.InputMismatchException;
import java.util.Scanner;

import utility.CustomException;
import utility.Utility;

public class ArrayListRunner 
{
	
	
	static Object getObject( Scanner input )
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
        		                		
        		                		
        		                	
        		                		   
        		                		   try
        		                		   {
        		                		           int count=getInt( input , "How many Strings you want" );
        		                		           
        		                		           Utility.numberCheck( count );
        		                		           
        		                		          
        		                		           
        		                		           Object array[]=new Object[ count ];
        		                		           
        		                		         
        		                		           
        		                		           for( int i=0;i<count;i++ )
        		                		           {
        		                		        	    array[i]= getObject( input  );
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
        		                		
        		                		
        		                		 
        		                		   
        		                		   try
        		                		   {
        		                		           int count=getInt( input , "How many Integers you want" );
        		                		           
        		                		           Utility.numberCheck( count );
        		                		           
        		                		           input.nextLine();
        		                		           
        		                		           Object array[]=new Object[ count ];
        		                		           
        		                		           System.out.println("Enter the Integers");
        		                		           
        		                		           for( int i=0;i<count;i++ )
        		                		           {
        		                		        	 
        		                		        	   while( true )
        		                		        	   {   
        		                		        	           try
        		                		        	           {
        		                		        	   
        		                		        	                  array[i]=getInt( input , "Integer "+(i+1) );
        		                		        	                  
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
                                	
                                	
                        	  int  index;
                        	  
                        	  int size1=callLogic.sizeOfArrayList();
                                
                        	  if( size1==0 )
                        	  {
                        		  System.out.println("List is empty");
                        	  }   
                        	  else
                        	  {
                                   while( true )	
                                   {	 
                                		 
                                         
                                     	try 
							            {
                                	
                                     		  index=getInt( input , "Enter the Index" );
							                 Utility.indexCheckForList( size1 , index );
							            
	                                	     
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
                                
                                
                                
                                    
                                      callLogic.addToArrayListGivenPosition( index , getObject( input ) );
                        	  }
                                	  break;
                                	  
                                	  
        		        
                                	  
                          case 4:
                                	
                                	
                                int index4,number;	
                                	
                                int size2=callLogic.sizeOfArrayList();
                                
                                
                                if( size2==0 )
                          	    {
                          		     System.out.println("List is empty");
                          	    }  
                                else
                                {
                                	
                                    while( true )	
                                    {	 
                                		 
                                         
                                     	try 
							            {
                                	
                                	         index4=getInt( input , "Enter the Index" );
							                 Utility.indexCheckForList( size2 , index4);
							             
	                                	     
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
                                
                                
                                
                                     
                                
                                  while( true )    
                                  {
                                	  
                                        try
                                        {
                                              number=getInt( input , "Enter the Integer" );
                                              break;
                                        }  
                                        catch( InputMismatchException ex )
		                		        {
		                			          System.out.println("Enter Number Only");
		                			          input.nextLine();
		                		        }
                                  }  
                                      callLogic.addToArrayListGivenPosition( index4 , number );
                                
                                	  
                                }
                                	  break;
                                	  
                          case 5:
                                	
                                	  callLogic.addTwoLists( callLogic.getArrayListWithObjects()  );
                                	
                                	
                                	  break;
                                	  
        		               
                                	  
                          case 6:
                          	
                          	
                               int index6;	
                          	
                          	   int size3=callLogic.sizeOfArrayList();
                          	   
                          	 if( size3==0 )
                       	     {
                       		     System.out.println("List is empty");
                       	     }
                          	 else 
                          	 {
                          	
                                   while( true )	
                                   {	 
                          		 
                                   
                               	           try 
						                   {
                          	
                          	                  index6=getInt( input , "Enter the Index" );
						                      Utility.indexCheckForList( size3 , index6);
						                  
                              	     
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
                          
                          	 }
                          	
                          	  break;    	  
                                	  
                                	  
                                	  
                          case 7:
                                	
                                 while( true )
                                 {
                            	   
                                	 int startingPosition,endingPosition;
                                 	
                                	
                                	 
                                	 while( true )
                                	 {	 
                                		 
                                	     try
                                	     {
                                	           startingPosition=getInt( input , "Enter the starting position" );
                                	           Utility.indexCheckForList( callLogic.sizeOfArrayList() , startingPosition );
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
                                	     
                                	
                                	 
                                	 while( true )
                                	 {	 
                                		 
                                	     try
                                	     {
                                	           endingPosition=getInt( input , "Enter the ending position" );
                                	           Utility.indexCheckForList( callLogic.sizeOfArrayList() , endingPosition );
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
                        	   
                        	        
                        	          int index10=callLogic.getIndexOfObject( getObject( input ) );
                        	          
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
                        	   
                 	                 
                 	          
                 	                  int index11=callLogic.getLastIndexOfObject( getObject( input ) );
                 	          
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
                        	         
                        	      
                        	        
                        	      while( true )
                        	      {
                        	    	  
                        	            try
                        	            {                     	         
                        	                 

                        	                  System.out.println( callLogic.getObject( getInt( input , "Enter the index" ) )  );
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
                        	   
                  	                  
                  	        
                  	                   while( true )
                  	                   {
                  	    	  
                  	                        try
                  	                        {   
                  	                            callLogic.removePosition( getInt( input , "Enter the index to remove" ) );  ;
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
                        	  

                                      callLogic.removeObject( getObject( input ) );
                        	  
                        	  
                        	      
                        	          break;
                  	         
                        	          
                          case 15:
                        	  
                        	      
                        	         
                        	         System.out.println( callLogic.isExist( getObject( input ) ) );
                        	         
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
