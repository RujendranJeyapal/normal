//$Id$
package hashmap;

import java.util.InputMismatchException;
import java.util.Scanner;

import utility.CustomException;
import utility.Utility;

public class HashMapRunner 
{
	
	
	static Object getObject( Scanner input , String type )
	{
		System.out.println("Enter the "+type+" (String)");
		
		return input.nextLine();
		
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
		          	    	  
		          	    	               System.out.println(" Howmany Keys( Integers ) and Values( Integers ) "
		          	    	               		+ " pair to you want to put Map ");
		          	    	      
		          	    	               int count=input.nextInt();
		          	    	               
		          	    	                Utility.numberCheck( count );
		          	    	  
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
		          	    	  
		          	    	               System.out.println(" Howmany Keys( String ) and Values( String )  "
		          	    	               		+ "pair to you want to put Map ");
		          	    	      
		          	    	               int count=input.nextInt();
		          	    	               
		          	    	             
		          	    	               Utility.numberCheck( count );
		          	    	               
		          	    	               input.nextLine();
		          	    	               
		          	    	  
		          	    	               for( int i=0;i<count;i++ )
		          	    	               {
		          	    	            	      
		          	    	            	      System.out.println( "Enter the Key" );
		          	    	            	      
		          	    	            	     
		          	    	            	      String key=input.nextLine();
		          	    	            	  
		          	   
		          	    	            	      System.out.println( "Enter the Value" );
		          	    	            	      
		          	    	            	     
		          	    	            	      String value=input.nextLine();
		         
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
		          	                            
		          	  case 3:
       	    	         
	          	    	  while( true )
	          	    	  {
	          	    	       try
	          	    	       {
	          	    	  
	          	    	               System.out.println(" Howmany Keys( Integers ) and Values( String ) "
	          	    	               		+ " pair to you want to put Map ");
	          	    	      
	          	    	               int count=input.nextInt();
	          	    	               
	          	    	               Utility.numberCheck( count );
	          	    	  
	          	    	               for( int i=0;i<count;i++ )
	          	    	               {
	          	    	            	   
	          	    	            	   int key;
	          	    	            	   
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
	          	    	            	      
	          	    	            	   input.nextLine();
   
	          	    	            	   System.out.println( "Enter the Value" );

	          	    	            	   String value=input.nextLine();

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
	          	                           
		          	case 4:
      	    	         
	          	    	  while( true )
	          	    	  {
	          	    	       try
	          	    	       {
	          	    	  
	          	    	               System.out.println(" Howmany Keys( String ) and Values( Integer ) "
	          	    	               		+ " pair to you want to put Map ");
	          	    	      
	          	    	               int count=input.nextInt();
	          	    	               
	          	    	               Utility.numberCheck( count );
	          	    	  
	          	    	               input.nextLine();
	          	    	               
	          	    	               for( int i=0;i<count;i++ )
	          	    	               {
	          	    	            	   
	          	    	            	   int value;
	          	    	            	   
	          	    	            	   System.out.println( "Enter the Key" );
	          	    	            	      
	          	    	            	   String key=input.nextLine();
	          	    	            	   
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
                                           
	          	    	            	   input.nextLine();
	          	    	            	   
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
		          		
                                    
                                          callLogic.addToHashMap( null , getObject( input , "value" ) );
	          	     
                                          break;
	          	        
		          	 case 6:                     
		          	                      
		          		     while( true )
		          		     {
		          		    	 
		          		           try
		          		           {
		          		 
		          		                   System.out.println("How many keys to you want for the null values");
		          		                   
		          		                   int count=input.nextInt();
		          		                   
		          		                   Utility.numberCheck( count );
		          		                   
		          		                   input.nextLine();
		          		                   
		          		                   for( int i=0;i<count;i++ )
		          		                   {
		          		                	    
		          		                	     System.out.println("Enter the key(String)");
		          		                	     String key=input.nextLine();
		          		                	     
		          		                	     callLogic.addToHashMap( key , null );
		          		                	   
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
		          		                
		          		                   
		          		                   callLogic.addToAbsentKey( getObject( input , "key" ) , getObject( input , "value" ) );
		          		 
		          		                   break;
		          	      
		          	 case 8:
		          		 
		          		                  
		          		                   
		          		                   System.out.println( callLogic.isKeyExistInHashMap( getObject( input , "key" ) ) );
		          		                   
		          		                   break;
		          		                   
		          	 case 9:	                   
		          		 
		          		                  
		          		                   
		          		                   System.out.println( callLogic.isValueExistInHashMap( getObject( input , "value" ) ) );
		          		                   
		          		                   break;
		          		
		          	 case 10:	                   
		          		                   
		          		                 
		          		                   
		          		                   System.out.println( callLogic.getValueFromKey( getObject( input , "key" ) ) );
		          		                   
		          		                   break;
		          		 
		          	 case 11:
		          		 	          		                 
		          		                   
		          		                   System.out.println( callLogic.getValueIfKeyIsAbsent( 
		          		                		   getObject( input , "key" ) , getObject( input , "default value" ) ) );
		          		                   
		          		                   break;
		          		 
		          		                   
		          	 case 12:

		                                   
		                                   callLogic.removeKey( getObject( input , "key" ) );
		          		 
		          		                   break;
		          		  
		          	 case 13:	                   

		          		                   
		          		                   callLogic.removeKeyIfValueMatch( getObject( input , "key" ) , getObject( input , "value" ) );
		          		                   
		          		                   
		          		                   break;
		          		 
		          	 case 14:
		          		 

		          		                   
		          		                   callLogic.replaceValue( getObject( input , "key" ) , getObject( input , "value" ) );
		          		                   
		          		                   break;
		          		                   
		          	 case 15:
		          		 
		          		                 
		          		                   
		          		                   callLogic.replaceThisValue( getObject( input , "key" ) , 
		          		                		 getObject( input , "old value" ), getObject( input , "new value" ) );
		          		                   
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
