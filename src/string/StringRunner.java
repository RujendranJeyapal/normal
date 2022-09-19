//$Id$
package string;

import java.util.InputMismatchException;
import java.util.Scanner;

import utility.CustomException;
import utility.Utility;

public class StringRunner 
{
	
	static String getString( Scanner input , String sentence )
	{
		System.out.println(sentence);
		
		return input.nextLine();
		
	}
	
	static int getInt( Scanner input , String sentence )
	{
		
        System.out.println(sentence);
		
		int result= input.nextInt();
		
		input.nextLine();
		
		return result;
		
	}
	
	
	static char getChar( Scanner input , String sentence )
	{
		System.out.println(sentence);
		
		return input.nextLine().charAt(0);
		
	}
	

	public static void main(String[] args) 
	{
		
		Scanner input=new Scanner( System.in );
		
		StringLogic callLogic=new StringLogic();
		
		boolean condition=true;
		
	 while( condition )
	 {
		
		System.out.println("Press 1-->Find the String Length\n"
				         + "Press 2-->Convert String to Character Array\n"
				         + "Press 3-->Find the letter from given index\n"
				         + "Press 4-->Find the index from given letter\n"
				         + "Press 5-->Find the last index from given letter\n"
				         + "Press 6-->Print Substring\n"
				         + "Press 7-->Check whether the string startswith given letters\n"
				         + "Press 8-->Check whether the string endswith given letters\n"
				         + "Press 9-->Convert LowerCase to UpperCase\n"
				         + "Press 10-->Convert UpperCase to LowerCase\n"
				         + "Press 11-->Concat multiple Strings\n"
				         + "Press 12-->Replace a letters\n"
				         + "Press 13-->Split a String\n"
				         + "Press 14-->Merge a array with given letters\n"
				         + "Press 15-->Reverse a String\n"
				         + "Press 16-->Check whether the two given input String are equal case sensitive\n"
				         + "Press 17-->Check whether the two given input String are equal case in sensitive\n"
				         + "Press 18-->To Trim a Given String\n"
				         + "other-->Exit");
		
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
			    
			                 System.out.println( callLogic.findStringLength( 
			                		 getString( input , "Enter the String to find Length" ) )  );
			                 break;
			           
			           }		  
			    
			           catch( CustomException ex )
			           {
			                 System.out.println(ex.getMessage());
			           }
			    
			    }
			 
			 
			    break;
			    
			  
		   case 2:    
			   
			   while( true )   
			   {  
			       
			   
			          try
			          {
				   
			                  char array[]=callLogic.
			                		  stringToCharArray( getString( input , "Enter the String to convert char Array" )  );
			  
			    
			                  for( char temp:array )
			                  {
				                   System.out.println(temp);
			                  }
			         
			                 break;
			   
			          }
			   
			          catch( CustomException ex )
			          {
			            	  System.out.println(ex.getMessage());
			          }
			   
			   } 
			   
			    break;
			   
			   
		   case 3:
			   
			   while( true )
			   {
			         
			         
			          try
			          {
			          
		
			                 
			                 System.out.println( 
			                		 callLogic.findTheLetter( getString( input , "Enter the String" )  ,
			                				 getInt( input , "Enter the index to find the letter" ) ) );
			                 
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
                    	    
                    	     int position=callLogic.findTheIndex(
                    	    		 getString( input , "Enter the String")  ,
                    	    		  getChar( input , "Enter the letter to find the index" ) );
                    	     
                    	     if( position==-1 )
                    	     {
                    	    	   System.out.println("This String is not contains the letter");
                    	     }
                    	     else
                    	     { 
			                     System.out.println( position );
                    	     }
			                 break;
			   
			          }
			   
			          catch( CustomException ex )
			          {
			            	  System.out.println(ex.getMessage());
			          }
			          
			      
			   
			   }
			   
			   
			     break;
			     
			     
            case 5:
			   
			   while( true )
			   {
			
			          
                      try   
                      {
                    	    
                    	     int position=callLogic.findTheLastIndex(
                    	    		 getString( input , "Enter the String")  ,
                   	    		  getChar( input , "Enter the letter to find the index" )
                    	    		 );
                    	     
                    	     if( position==-1 )
                    	     {
                    	    	   System.out.println("This String is not contains the letter");
                    	     }
                    	     else
                    	     { 
			                     System.out.println( position );
                    	     }
			                 break;
			   
			          }
			   
			          catch( CustomException ex )
			          {
			            	  System.out.println(ex.getMessage());
			          }
			          
			      
			   
			   }
			   
			   
			     break;     
			     
			     
            case 6:
            	
               while( true )
 			   {
 			        

 			          
                      try   
                      {
                     	
                     	    
                     	    System.out.println(  callLogic.getSubString(
                     	    		getString( input , "Enter the String" ) ,
                     	    		getInt( input , "Enter the first index of the string"),
                     	    		getInt( input, "Enter the last index of the string" ) )  );
                     	    
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
            	
            	
            	while( true )
            	{	

            	     
            	     try 
            	     {
						      System.out.println( callLogic.startingCheck( 
						    		  getString( input , "Enter  the string" ),
						    		  getString( input ,  "Enter the string to check ")) );
						      break;
					 } 
            	     catch( CustomException ex )
			         {
			            	  System.out.println(ex.getMessage());
			         }
            	
            	}     
 			         
            	
            	  break;
            	  
            	  
            	  
           case 8:
            	
            	
            	while( true )
            	{	
            	
            	  
            	     
            	     try 
            	     {
						      System.out.println( callLogic.endingCheck(getString( 
						    		  input , "Enter  the string" ),
						    		  getString( input ,  "Enter the string to check ")) );
						      break;
					 } 
            	     catch( CustomException ex )
			         {
			            	  System.out.println(ex.getMessage());
			         }
            	
            	}     
 			         
            	
            	  break;	  
            	  
            	  
           case 9:
        	   
        	   
        	   while( true )
           	   {	
           	
           
        	  
           	     
           	         try 
           	         {
						      System.out.println( callLogic.toConvertUpper(
						    		  getString( input , "Enter  the string to convert uppercase" )) );
						      break;
					 } 
           	         catch( CustomException ex )
			         {
			            	  System.out.println(ex.getMessage());
			         }
           	
           	   }     
			         
           	
           	   break;
           	   
           	   
           case 10:
        	   
        	   
        	   while( true )
           	   {	
           	
  
        	  
           	     
           	         try 
           	         {
						      System.out.println( callLogic.toConvertLower(
						    		 getString( input , "Enter  the string to convert uppercase" ) ) );
						      break;
					 } 
           	         catch( CustomException ex )
			         {
			            	  System.out.println(ex.getMessage());
			         }
           	
           	   }     
			         
           	
           	   break;   
        	   
			     
           case 11:
        	   
        	   
        	   while( true )
           	   {	
           	
                     try 
           	         {
                    	      
                    	      
                    	      int count=getInt( input, "How many strings you want to concat " );
                    	      
                    	      Utility.numberCheck( count );
                    	      
                    	 
                    	      
                    	      String inputStrings[]=new String[count];
                    	      
                    	      for( int i=0;i<count;i++ )
                    	      {
                    	    	  inputStrings[i]= getString( input,"String "+i+1 ) ;
                    	      }
                    	      
                    	      System.out.println( callLogic.concatStrings( inputStrings,count )  );
                    	      
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
        	   
           	   
          case 12:
        	   
        	   
        	   while( true )
           	   {	
           	   

        		     
        
        		   
        		   
                     try 
           	         {
                    	      
                    	      System.out.println( callLogic.replaceString( 
                    	    		  getString( input , "Enter the String" ),
                    	    		  getString( input , "Choose the continuous letters to remove"  ),
                    	    		  getString( input , "Enter the new letter " ) 
                    	    		  )  );
						      break;
					 } 
           	         catch( CustomException ex )
			         {
			            	  System.out.println(ex.getMessage());
			         }
           	       
           	
           	   }     
			         
           	
           	   break;   
           	   
           	   
          case 13:
       	   
       	   
       	      while( true )
          	  {	
          	   

       		   
                    try 
          	         {
                   	      
                   	          String array[]=callLogic.splitString( 
                   	        		  getString( input , "Enter the String" ),
                   	        		  getString( input , "Choose a letter to split" ) )  ;
                   	          
                   	          for( String temp:array )
                   	          {
                   	        	  System.out.println(temp);
                   	          }
                   	          
						      break;
					 } 
          	         catch( CustomException ex )
			         {
			            	  System.out.println(ex.getMessage());
			         }
          	       
          	
          	   }     
			         
          	
          	   break;   
        	     
           	   
          case 14:
        	  
        	     
        	     
        	   while( true )
          	   {	
          	
                     try 
          	         {
                   
                   	      
                   	      int count=getInt( input , "How many strings you want to merge " );
                   	      
                   	      Utility.numberCheck( count );
                   	      
                   	     
                   	      
                   	      String inputStrings[]=new String[count];
                   	      
                   	      System.out.println("Enter the Strings");
                   	      
                   	      for( int i=0;i<count;i++ )
                   	      {
                   	    	  inputStrings[i]=getString( input , "String "+i+1 );
                   	      }
                   	      

                   	      
                   	      System.out.println( callLogic.mergeStrings( inputStrings,count,getString( input , "Enter the letters to merge"  ) )  );
                   	      
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
        	  
        	  while( true )
         	   {	
         	
                     try 
         	         {
                  	      
 
                    	  
                    	  System.out.println( callLogic.toReverseAString( getString( input , "Enter the String to reverse") ) );
                  	      
						  break;
						  
					 } 
         	         catch( CustomException ex )
			         {
			            	  System.out.println(ex.getMessage());
			         }
         	      
         	
         	   }     
  			         
            	
            	   break; 
          	   
            	   
            	   
          case 16:
          	
          	
          	while( true )
          	{	

          	     
          	      try 
          	      {
						  System.out.println( callLogic.isTwoStringsAreEqual(
								  getString( input , "Enter the string" ), 
								  getString( input , "Enter the string to check " ) 
								  ) );
						  break;
				  } 
          	      catch( CustomException ex )
			      {
			              System.out.println(ex.getMessage());
			      }
          	
          	}     
			         
          	
          	  break; 	
          	  
          	  
          case 17:
            	
            	
            	while( true )
            	{	
            	
           
            	     
            	      try 
            	      {
  						  System.out.println( callLogic.isTwoStringsAreEqualsIgnoreCase( 
  								  getString( input , "Enter the string" ), 
  								  getString( input , "Enter the string to check " )
  								  ) );
  						  break;
  				      } 
            	      catch( CustomException ex )
  			          {
  			              System.out.println(ex.getMessage());
  			          }
            	
            	}     
  			         
            	
            	  break;   
            	  
            	  
          case 18:
          	
          	
          	while( true )
          	{	
          	
          	  

          	     
          	          try 
          	          {
						  System.out.println( callLogic.toTrimAString( getString( input , "Enter the string"  ) ) );
						  break;
				      } 
          	          catch( CustomException ex )
			          {
			              System.out.println(ex.getMessage());
			          }
          	
          	}     
			         
          	
          	  break; 	  
           	   
			default:
				
				     condition=false;
			
	    }	
		
      }
		
		
		input.close();
              
	}

}
