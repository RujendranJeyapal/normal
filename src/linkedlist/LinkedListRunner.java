//$Id$
package linkedlist;

import java.util.InputMismatchException;
import java.util.Scanner;


import utility.CustomException;
import utility.Utility;

public class LinkedListRunner 
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
		
		
        LinkedListLogic callLogic=new LinkedListLogic();
        
        boolean condition=true;
        
        
        while( condition )
        {
        	 
        
                System.out.println("Press 1-->Add Strings to LinkedList\n"
		                         + "Press 2-->Add Integers to LinkedList\n"
		                         + "Press 3-->Add String to LinkedList given Position\n"
		                         + "Press 4-->Add String to LinkedList given Position using set() method\n"
		                         + "Press 5-->Add Integer to LinkedList given Position\n"
		                         + "Press 6-->Add Two Lists\n"
		                         + "Press 7-->Add Two Lists in Given Index\n"
		                         + "Press 8-->Get Sub List\n"
		                         + "Press 9-->Remove the element "
		                         + "from the first LinkedList which are present in second Linkedlist\n"
		                         + "Press 10-->Remove the element from the fist "
		                         + "LinkedList which aren't present in 2nd LinkedList\n"
		                         + "Press 11-->Get the index of the Given Element\n"
		                         + "Press 12-->Get the last index of the Given Element\n"
		                         + "Press 13-->Get the Element of the given index\n"
		                         + "Press 14-->Remove the index\n"
		                         + "Press 15-->Remove the Element(String)\n"
		                         + "Press 16-->Check whether the element is Exist\n"
		                         + "Press 17-->Add element to the first index of LinkedList\n"
		                         + "Press 18-->Add element to the last index of LinkedList\n"
		                         + "Press 19-->Add element to the last index of LinkedList using offer method\n"
		                         + "Press 20-->Add element to the first index of LinkedList using offerFirst method\n"
		                         + "Press 21-->Add element to the last index of LinkedList using offerLast method\n"
		                         + "Press 22-->Retrive and doesn't remove the first element using element() method\n"
		                         + "Press 23-->Retrive and doesn't remove the first element using peek() method\n"
		                         + "Press 24-->Retrive and doesn't remove the first element using peekFirst() method\n"
		                         + "Press 25-->Retrive and doesn't remove the last element using peekLast() method\n"
		                         + "Press 26-->Retrive and remove the first element using poll() method\n"
		                         + "Press 27-->Retrive and remove the first element using pollFirst() method\n"
		                         + "Press 28-->Retrive and remove the first element using pollLast() method\n"
		                         + "Press 29-->Retrive and remove the first element using removeFirst() method\n"
		                         + "Press 30-->Retrive and remove the last element using removeLast() method\n"
		                         + "Press 31-->Remove first occurence of object\n"
		                         + "Press 32-->Remove last occurence of object\n"
		                         + "Press 33-->get first element\n"
		                         + "Press 34-->get last element\n"
		                         + "Press 35-->Print the size of LinkedList\n"
		                         + "Press 36-->Print the LinkedList\n"
		                         + "Press 37-->Clear the LinkedList\n"
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
		                		           
		                		           callLogic.addToLinkedList( array );
		                		           
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
		                		           
		                		           callLogic.addToLinkedList( array );
		                		           
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
                	  
                	  int size=callLogic.sizeOfLinkedList();
                	  
                	  
                	  if( size==0 )
                	  {
                		  System.out.println("List is Empty");
                	  }
                	  else
                	  { 	
                           while( true )	
                           {	 
                        		 
                                 
                             	try 
					            {
                        	
                             		  index=getInt( input , "Enter the Index" );
                             		  
                             		  
                             		  
                             		  
                             		  
					                  Utility.indexCheckForList(  size , index );
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
                        
                        
                        
                            
                              callLogic.addToLinkedListGivenPosition( index , getObject( input ) );
                	  }
                        	  break;
                        	  
                        
                        	  
                  case 4:   
                	  
                	  
                	    int  index1;
                  	
                	    int size1=callLogic.sizeOfLinkedList();
                	    
                	    if( size1==0 )
                  	    {
                  		     System.out.println("List is Empty");
                  	    }
                	    
                	    else
                	    {
                	    
                            while( true )	
                            {	 
                   		 
                            
                        	      try 
				                  {
                   	
                        		        index1=getInt( input , "Enter the Index" );
				                        Utility.indexCheckForList( size1 , index1 );
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
                   
                   
                   
                       
                               System.out.println(  callLogic.set( index1 , getObject( input ) ) );  
                	    }
                   	           break;
                        	  
		        
                        	  
                  case 5:
                        	
                        	
                            int index4=0,number;	
                        	
                        	int size2=callLogic.sizeOfLinkedList();
                        	
                        	
                        	if( size2==0 )
                      	    {
                      		     System.out.println("List is Empty");
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
                              callLogic.addToLinkedListGivenPosition( index4 , number );
                        
                        } 
                        	
                        	  break;
                        	  
                  case 6:
                        	
                        	  callLogic.addTwoLists( callLogic.getLinkedListWithObjects()  );
                        	
                        	
                        	  break;
                        	  
		               
                        	  
                  case 7:
                  	
                  	
                          int index6;	
                  	
                  	      int size6=callLogic.sizeOfLinkedList();
                  	
                  	     if( size6==0 ) 
                  	     {
                  	    	 System.out.println("List is Empty");
                  	     }
                  	     else
                  	     { 
                           while( true )	
                           {	 
                  		 
                           
                       	           try 
				                   {
                  	
                  	                  index6=getInt( input , "Enter the Index" );
				                      Utility.indexCheckForList( size6 , index6);
				                   
                      	     
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
                  
                  	     
                  
                            callLogic.addListToIndexOfAnotherList( index6 , callLogic.getLinkedListWithObjects() );
                  	     }
                  	  
                  	
                  	  break;    	  
                        	  
                        	  
                        	  
                  case 8:
                        	
                         while( true )
                         {
                    	   
                        	 int startingPosition,endingPosition;
                         	
                        	
                        	 
                        	 while( true )
                        	 {	 
                        		 
                        	     try
                        	     {
                        	           startingPosition=getInt( input , "Enter the starting position" );
                        	           Utility.indexCheckForList( callLogic.sizeOfLinkedList() , startingPosition );
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
                        	           Utility.indexCheckForList( callLogic.sizeOfLinkedList() , endingPosition );
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
                        	  
                        	
                   case 9:  
                	   
                	          callLogic.removeAllObjects( callLogic.getLinkedListWithObjects() ) ;     
                	   
                	          break;
                   
                   case 10:
                	   
                	          callLogic.retainAllObjects( callLogic.getLinkedListWithObjects() );
                	          
                	          break;
                        
                	
                   case 11:
                	   
                	        
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
                	          
                   case 12:
                	   
         	                 
         	          
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
                 	  
         	                  
                   case 13:
                	         
                	      
                	        
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
                	         
                	         
                  case 14:
                	   
          	                  
          	        
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
                	         
          	         
          	         
                  case 15:
                	  

                              callLogic.removeObject( getObject( input ) );
                	  
                	  
                	      
                	          break;
          	         
                	          
                  case 16:
                	  
                	      
                	         
                	         System.out.println( callLogic.isExist( getObject( input ) ) );
                	         
                	         break; 
                	          
                	         
                  case 17:
                	  
                	         callLogic.addFirstIndex( getObject( input ) );
                	  
                	  
                	         break;
                       
                	         
                  case 18:
                	  
                	         callLogic.addLastIndex( getObject( input ) );
                	         
                	         break;
                	         
                	         
                  case 19:
                	  
                	         System.out.println( callLogic.offer(  getObject( input ) ) );
                	         
                	         break;
                	         
                  case 20:
                	  
                	         System.out.println( callLogic.offerFirst( getObject( input ) ) );
                	  
                	         break;
                	         
                  case 21:
                	    
                	         System.out.println( callLogic.offerLast( getObject( input ) ) );
                	  
                	         break;
                	         
                  case 22:
                	  
                	         try
                	         {  
                	  
                	               System.out.println( callLogic.element() );
                	         }
                	         catch( CustomException ex )
                	         {
                	        	   System.out.println( ex.getMessage() );
                	         }
                	        
                	         
                	         break;
                	 
                  case 23:
                	  
                	         Object result=callLogic.peek();
                	         
                	         if( result==null )
                	         {
                	        	 System.out.println("List has no element");
                	         }
                	         
                	         else 
                	         {
                	              System.out.println( result );	 
                	         }
                	  
                	         break;
                	   
                	         
                  case 24:
                	     
                	         Object result1=callLogic.peekFirst();
         	         
         	                 if( result1==null )
         	                 {
         	        	          System.out.println("List has no element");
         	                 }
         	         
         	                 else 
         	                 {
         	                      System.out.println( result1 );	
                	        
         	                 }
         	                 
                	         break;
                	         
                	         
                  case 25:
                	  
                	     
                	         Object result2=callLogic.peekLast();
          	         
  	                         if( result2==null )
  	                         {
  	        	                  System.out.println("List has no element");
  	                         }
  	                         else 
  	                         {
  	                              System.out.println( result2 );	
         	        
  	                         }
  	                 
         	                 break;   
         	                 
                  case 26:
                	   
                	         Object result3=callLogic.poll();
           	         
                             if( result3==null )
                             {
       	                         System.out.println("List has no element");
                             }
                             else 
                             {
                                 System.out.println( result3 );	
  	        
                             }
                
  	                         break; 
                	
  	                         
                  case 27:
               	   
         	                Object result4=callLogic.pollFirst();
    	         
                            if( result4==null )
                            {
	                              System.out.println("List has no element");
                            }
                            else 
                            {
                                  System.out.println( result4 );	
       
                            }
         
                     
                            break;          
         	         
                            
                            
                            
                  case 28:
                  	   
   	                        Object result5=callLogic.pollLast();
	         
                           if( result5==null )
                           {
                                    System.out.println("List has no element");
                           }
                           else 
                           {
                                  System.out.println( result5 );	
 
                           }
   
                           break;          
                     
                           
                 case 29:          
                            
                	           try
                	           {
                	        	   
                                  System.out.println( callLogic.removeFirst() );
                                  
                	           }
                	           catch( CustomException ex )
                	           {
                	        	   System.out.println( ex.getMessage() );
                	           }
                               
                               break;
                               
                               
                 case 30:          
                     
                	           try
                	           {
                	 
                                   System.out.println( callLogic.removeLast() );
                                   
                	           }   
                	           catch( CustomException ex )
                	           {
                	        	   System.out.println( ex.getMessage() );
                	           }
                	           
                              break;     
                              
                              
                 case 31:
                	 
                	 
                	          System.out.println( callLogic.removeFirstOccurence(  getObject( input ) ) );
                	          
                	          break;
                     
                	          
                 case 32:
                	 
                	 
       	                     System.out.println( callLogic.removeLastOccurence(  getObject( input ) ) );
       	          
       	                     break;          
                              
                	         
                  case 33:
                	  
                	         try
         	                 {   
         	  
         	                       System.out.println( callLogic.getFirst() );
         	                 }
         	                 catch( CustomException ex )
         	                 {
         	        	           System.out.println( ex.getMessage() );
         	                 }
                	         
                	         break;
                	         
                	         
                  case 34:
                	       
                	        try
  	                        {   
  	  
  	                               System.out.println( callLogic.getLast() );
  	                        }
  	                        catch( CustomException ex )
  	                        {
  	        	                   System.out.println( ex.getMessage() );
  	                        }
                	  
                	          break;
                	         
                  case 35:
                        	
                        	  System.out.println( "Size :"+callLogic.sizeOfLinkedList() );
		                	  
                        	  break;
                        	  
                        	  
                  case 36:
                        	 
                        	 System.out.println( callLogic.getActualList() );
                        	 
                        	 break;
                        	
                  case 37:
                	   
                	         callLogic.clearLinkedList();
                	   
                	         break;
                        	 
		        
		           default:
		                	
		                	  condition=false;
		        
		        }

		                   
        }                  
		
		input.close();

	}

}
