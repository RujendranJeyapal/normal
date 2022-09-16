//$Id$
package string;

import java.util.InputMismatchException;
import java.util.Scanner;

import utility.CustomException;

public class StringRunner 
{

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
				 
			           System.out.println("Enter the String to find Length");
			    
			           String inputString=input.nextLine();
			    
			           try
			           {
			    
			                 System.out.println( callLogic.findStringLength(inputString)  );
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
			          System.out.println("Enter the String to convert char Array");
			   
			          String inputString=input.nextLine();
			   
			          try
			          {
				   
			                  char array[]=callLogic.stringToCharArray(inputString);
			  
			    
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
			          System.out.println("Enter the String");
			         
			          String inputString=input.nextLine();
			         
			          try
			          {
			          
			                 System.out.println("Enter the index to find the letter");
			       
			                 int position=input.nextInt();
                            
			                 input.nextLine();
			                 
			                 System.out.println( callLogic.findTheLetter(inputString, position) );
			                 
			                 break;
			   
			          }
			   
			          catch( CustomException ex )
			          {
			            	  System.out.println(ex.getMessage());
			          }
			          
			          catch( InputMismatchException ex )
			  		  {
			  			System.out.println("Enter Number Only");
			  		  }
			   
			   }
			   
			   
			     break;
			     
			     
		   case 4:
			   
			   while( true )
			   {
			          System.out.println("Enter the String");
			         
			          String inputString=input.nextLine();
			         
			         
			          
			          System.out.println("Enter the letter to find the index");
			       
			          char letter=input.nextLine().charAt(0);
			                 
                      try   
                      {
                    	    
                    	     int position=callLogic.findTheIndex(inputString, letter);
                    	     
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
			          System.out.println("Enter the String");
			         
			          String inputString=input.nextLine();
			         
			         
			          
			          System.out.println("Enter the letter to find the index");
			       
			          char letter=input.nextLine().charAt(0);
			          
                      try   
                      {
                    	    
                    	     int position=callLogic.findTheLastIndex(inputString, letter);
                    	     
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
 			          System.out.println("Enter the String");
 			         
 			          String inputString=input.nextLine();

 			          
                      try   
                      {
                     	    System.out.println("Enter the first index of the string");
                     	    int firstIndex=input.nextInt();
                     	    
                     	    input.nextLine();
                     	    
                     	    System.out.println("Enter the last index of the string");
                     	    int lastIndex=input.nextInt();
                     	    
                     	    input.nextLine();
                     	    
                     	    System.out.println(  callLogic.getSubString( inputString,firstIndex,lastIndex )  );
                     	    
                     	    break;
                     	    
 			          }
 			   
 			          catch( CustomException ex )
 			          {
 			            	  System.out.println(ex.getMessage());
 			          }
                      catch( InputMismatchException ex )
			  		  {
			  			      System.out.println("Enter Number Only");
			  		  }
 			      
 			   
 			   }
 			   
 			   
 			     break;
            	  
			
            case 7:
            	
            	
            	while( true )
            	{	
            	
            	     System.out.println("Enter  the string");
            	     
            	     String inputString=input.nextLine();
            	     
            	     System.out.println("Enter the string to check ");
            	     
            	     String checkString=input.nextLine();
            	     
            	     try 
            	     {
						      System.out.println( callLogic.startingCheck(inputString, checkString) );
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
            	
            	     System.out.println("Enter  the string");
            	     
            	     String inputString=input.nextLine();
            	     
            	     System.out.println("Enter the string to check ");
            	     
            	     String checkString=input.nextLine();
            	     
            	     try 
            	     {
						      System.out.println( callLogic.endingCheck(inputString, checkString) );
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
           	
           	     System.out.println("Enter  the string to convert uppercase");
           	     
           	     String inputString=input.nextLine();
        	  
           	     
           	         try 
           	         {
						      System.out.println( callLogic.toConvertUpper(inputString) );
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
           	
           	     System.out.println("Enter  the string to convert uppercase");
           	     
           	     String inputString=input.nextLine();
        	  
           	     
           	         try 
           	         {
						      System.out.println( callLogic.toConvertLower(inputString) );
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
                    	      System.out.println("How many strings you want to concat ");
                    	      
                    	      int count=input.nextInt();
                    	      
                    	      input.nextLine();
                    	      
                    	      String inputStrings[]=new String[count];
                    	      
                    	      for( int i=0;i<count;i++ )
                    	      {
                    	    	  inputStrings[i]=input.nextLine();
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
			  		 }
                    
           	
           	   }     
			         
           	
           	   break;   
        	   
           	   
          case 12:
        	   
        	   
        	   while( true )
           	   {	
           	   
        		     System.out.println("Enter the String");
        		     
        		     String inputString=input.nextLine();
        		     
        		     System.out.println("Choose the continuous letters to remove");
        		     String removeLetters=input.nextLine();
        		     
        		     System.out.println("Enter the new letter ");
        		     
        		     String newLetters=input.nextLine();
        		   
        		   
                     try 
           	         {
                    	      
                    	      System.out.println( callLogic.replaceString( inputString,removeLetters,newLetters )  );
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
          	   
       		        System.out.println("Enter the String");
       		     
       		        String inputString=input.nextLine();
       		     
       		        System.out.println("Choose a letter to split");
       		        String letter=input.nextLine();
       		   
       		   
                    try 
          	         {
                   	      
                   	          String array[]=callLogic.splitString( inputString,letter )  ;
                   	          
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
                   	      System.out.println("How many strings you want to merge ");
                   	      
                   	      int count=input.nextInt();
                   	      
                   	      input.nextLine();
                   	      
                   	      String inputStrings[]=new String[count];
                   	      
                   	      System.out.println("Enter the Strings");
                   	      
                   	      for( int i=0;i<count;i++ )
                   	      {
                   	    	  inputStrings[i]=input.nextLine();
                   	      }
                   	      
                   	      System.out.println("Enter the letters to merge" );
                	      
                	      String sympol=input.nextLine();
                   	      
                   	      System.out.println( callLogic.mergeStrings( inputStrings,count,sympol )  );
                   	      
						  break;
						  
					 } 
          	         catch( CustomException ex )
			         {
			            	  System.out.println(ex.getMessage());
			         }
          	         catch( InputMismatchException ex )
			  	     {
			  			      System.out.println("Enter Number Only");
			  		 }
          	
          	   }     
   			         
             	
             	   break;  
        	     
        	     
             	   
          case 15:
        	  
        	  while( true )
         	   {	
         	
                     try 
         	         {
                  	      
                    	  System.out.println("Enter the String to reverse");
                    	  
                    	  String inputString=input.nextLine();
                    	  
                    	  System.out.println( callLogic.toReverseAString( inputString ) );
                  	      
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
          	
          	      System.out.println("Enter the string");
          	     
          	      String oneString=input.nextLine();
          	     
          	      System.out.println("Enter the string to check ");
          	     
          	      String anotherString=input.nextLine();
          	     
          	      try 
          	      {
						  System.out.println( callLogic.isTwoStringsAreEqual( oneString, anotherString ) );
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
            	
            	      System.out.println("Enter the string");
            	     
            	      String oneString=input.nextLine();
            	     
            	      System.out.println("Enter the string to check ");
            	     
            	      String anotherString=input.nextLine();
            	     
            	      try 
            	      {
  						  System.out.println( callLogic.isTwoStringsAreEqualsIgnoreCase( oneString, anotherString ) );
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
          	
          	      System.out.println("Enter the string");
          	     
          	      String inputString=input.nextLine();

          	     
          	          try 
          	          {
						  System.out.println( callLogic.toTrimAString( inputString ) );
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
