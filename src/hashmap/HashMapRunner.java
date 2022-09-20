//$Id$
package hashmap;

import java.util.InputMismatchException;
import java.util.Scanner;

import utility.CustomException;
import utility.Utility;

public class HashMapRunner 
{
	
	
	static Object getString( Scanner input , String type )
	{
		System.out.println("Enter the "+type+" (String)");
		
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
		       		                       + "Press 7-->Add values to Absent Key\n"
		       		                       + "Press 8-->Check whether the key is exist\n"
		       		                       + "Press 9-->Check whether the value is exist\n"
		       		                       + "Press 10-->Get value from Key\n"
		       		                       + "Press 11-->Get Value or Default Value from Key\n"
		       		                       + "Press 12-->Remove key from HashMap\n"
		       		                       + "Press 13-->Remove key whether the value is match\n"
		       		                       + "Press 14-->Replace the value in key\n"
		       		                       + "Press 15-->Replace the value whether this value is same in key\n"
		       		                       + "Press 16-->Put two HashMaps\n"
		       		                       + "Press 17-->Print the size of the HashMap\n"
		       		                       + "Press 18-->Print the HashMap\n"
		       		                       + "Press 19-->Clear the HashMap\n"
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
		          	    	  
		          	    	             
		          	    	      
		          	    	               int count=getInt( input , " Howmany Keys( Integers ) and Values( Integers ) "
			          	    	               		+ " pair to you want to put Map " );
		          	    	               
		          	    	                Utility.numberCheck( count );
		          	    	  
		          	    	               for( int i=0;i<count;i++ )
		          	    	               {
		          	    	            	   
		          	    	            	   int key,value=0;
		          	    	            	   
		          	    	            	   while( true )
		          	    	            	   {
		          	    	            		   
		          	    	            	      
		          	    	            	      
		          	    	            	      try
		          	    	            	      {
		          	    	            	          key=getInt( input ,  "Enter the Key" );
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
		          	    	            		   
		          	    	            	    
		          	    	            	      
		          	    	            	      try
		          	    	            	      {
		          	    	            	         value=getInt( input , "Enter the Value"  );
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
		          	    	  
		          	    	              
		          	    	      
		          	    	               int count=getInt( input , " Howmany Keys( Integers ) and Values( Integers ) "
			          	    	               		+ " pair to you want to put Map " );
		          	    	               
		          	    	             
		          	    	               Utility.numberCheck( count );
		          	    	               
		          	    	           
		          	    	               
		          	    	  
		          	    	               for( int i=0;i<count;i++ )
		          	    	               {
		          	    	            	      
		          	    	            	    
		         
		          	    	            	      callLogic.addToHashMap( getString( input , "key" ) , getString( input , "value" ) );
		          	    	            	   
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
       	    	         
	          	    	  while( true )
	          	    	  {
	          	    	       try
	          	    	       {
	          	    	  
	          	    	          
	          	    	      
	          	    	               int count=getInt( input , " Howmany Keys( Integers ) and Values( String ) "
		          	    	               		+ " pair to you want to put Map "  );
	          	    	               
	          	    	               Utility.numberCheck( count );
	          	    	  
	          	    	               for( int i=0;i<count;i++ )
	          	    	               {
	          	    	            	   
	          	    	            	   int key;
	          	    	            	   
	          	    	            	   while( true )
	          	    	            	   {
	          	    	            		   
	          	    	            	   
	          	    	            	      
	          	    	            	      try
	          	    	            	      {
	          	    	            	          key=getInt( input ,  "Enter the Key"  );
	          	    	            	          break;
	          	    	            	      }
	          	    	            	      catch( InputMismatchException ex )
	       		          	    	          {
	       		          	    	    	      System.out.println("Enter Number Only");
	       		          	    	    	      input.nextLine();
	       		          	    	          }
	          	    	            	      
	          	    	            	   }    
	          	    	            	      
	          	    	            	
   
	          	    	            	 

	          	    	            	  

	          	    	            	   callLogic.addToHashMap( key , getString( input , "value" ) );
	          	    	            	   
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
	          	                           
		          	case 4:
      	    	         
	          	    	  while( true )
	          	    	  {
	          	    	       try
	          	    	       {
	          	    	  
	          	    	            
	          	    	      
	          	    	               int count=getInt( input ,  " Howmany Keys( String ) and Values( Integer ) "
		          	    	               		+ " pair to you want to put Map ");
	          	    	               
	          	    	               Utility.numberCheck( count );
	          	    	  
	          	    	               
	          	    	               for( int i=0;i<count;i++ )
	          	    	               {
	          	    	            	   
	          	    	            	   int value;
	          	    	            	   
	          	    	            	   
	          	    	            	      
	          	    	            	   Object key=getString( input , "key" );
	          	    	            	   
	          	    	            	   while( true )
	          	    	            	   {

	          	    	            	      
	          	    	            	      
	          	    	            	      try
	          	    	            	      {
	          	    	            	          value=getInt( input , "Enter the Value" );
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
		          	        
	          	                           
	          	                           
		          	 case 5:
		          		
                                    
                                          callLogic.addToHashMap( null , getString( input , "value" ) );
	          	     
                                          break;
	          	        
		          	 case 6:                     
		          	                      
		          		     while( true )
		          		     {
		          		    	 
		          		           try
		          		           {
		          		 
		          		                   
		          		                   
		          		                   int count=getInt( input , "How many keys to you want for the null values" );
		          		                   
		          		                   Utility.numberCheck( count );
		          		                   
		          		                
		          		                   
		          		                   for( int i=0;i<count;i++ )
		          		                   {
		          		                	    
		          		               
		          		                	     
		          		                	     callLogic.addToHashMap( getString( input , "key" ) , null );
		          		                	   
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
		          	                       
		          	                       
		          	 case 7:
		          		                
		          		                   
		          		                   callLogic.addToAbsentKey( getString( input , "key" ) , getString( input , "value" ) );
		          		 
		          		                   break;
		          	      
		          	 case 8:
		          		 
		          		                  
		          		                   
		          		                   System.out.println( callLogic.isKeyExistInHashMap( getString( input , "key" ) ) );
		          		                   
		          		                   break;
		          		                   
		          	 case 9:	                   
		          		 
		          		                  
		          		                   
		          		                   System.out.println( callLogic.isValueExistInHashMap( getString( input , "value" ) ) );
		          		                   
		          		                   break;
		          		
		          	 case 10:	                   
		          		                   
		          		                 
		          		                   
		          		                   System.out.println( callLogic.getValueFromKey( getString( input , "key" ) ) );
		          		                   
		          		                   break;
		          		 
		          	 case 11:
		          		 	          		                 
		          		                   
		          		                   System.out.println( callLogic.getValueIfKeyIsAbsent( 
		          		                		   getString( input , "key" ) , getString( input , "default value" ) ) );
		          		                   
		          		                   break;
		          		 
		          		                   
		          	 case 12:

		                                   
		                                   callLogic.removeKey( getString( input , "key" ) );
		          		 
		          		                   break;
		          		  
		          	 case 13:	                   

		          		                   
		          		                   callLogic.removeKeyIfValueMatch( getString( input , "key" ) , getString( input , "value" ) );
		          		                   
		          		                   
		          		                   break;
		          		 
		          	 case 14:
		          		 

		          		                   
		          		                   callLogic.replaceValue( getString( input , "key" ) , getString( input , "value" ) );
		          		                   
		          		                   break;
		          		                   
		          	 case 15:
		          		 
		          		                 
		          		                   
		          		                   callLogic.replaceThisValue( getString( input , "key" ) , 
		          		                		 getString( input , "old value" ), getString( input , "new value" ) );
		          		                   
		          		                   break;
		          		
		          		                   
		          	 case 16:
		          		 
		          		                   callLogic.addAnotherMap(  callLogic.getMapWithKeysValues() );
		          		 
		          		                   break;
		          		                   
		          		                   
		          	 case 17:
		          	    	  
		          	    	               System.out.println(" Size is :"+callLogic.sizeOfMap());
		          	    	               
		          	    	               break;
		          	                       
		          	                       
		          	 case 18:
		          	    	  
		          	    	               System.out.println( callLogic.getActualMap() );
		          	                       
		          	    	               break;
		          	      
		          	    	               
		          	 case 19:
		          		 
		          		                   callLogic.clearMap();                 
		          		   
		          		                   break;
		          	    	    
		          	 default:
		          	    	  
		          	    	               condition=false;
		          	
		          	
		          	}	                   
		          		                   
		          		                   
		          		                   
		                  
		                  
		       } 
		
		
	 	       input.close();

	}

}
