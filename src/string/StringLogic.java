//$Id$
package string;

import utility.CustomException;
import utility.Utility;

public class StringLogic 
{

	    
	public int findStringLength( String inputString  ) throws CustomException
	{
		
		Utility.stringCheck(inputString);
		
		 
		
		return inputString.length();
		
	}
	
	
	public char[] stringToCharArray( String inputString  ) throws CustomException
	{
		
		Utility.stringCheck(inputString);
		
		return inputString.toCharArray();
		
	}
	
	public char findTheLetter( String inputString , int position ) throws CustomException
	{
		
		int length=findStringLength( inputString );
		
		Utility.positionCheck( length , position);
		
		return inputString.charAt( position ); 
		
	}


	public int findTheIndex( String inputString, char letter ) throws CustomException
	{
	
		Utility.stringCheck(inputString);
		
		return inputString.indexOf(letter);
		
	}
	    
	public int findTheLastIndex( String inputString, char letter ) throws CustomException
	{
		
		Utility.stringCheck(inputString);
		
		return inputString.lastIndexOf(letter);
	}


	public String getSubString( String inputString, int firstIndex, int lastIndex ) throws CustomException
	{
		
		int length=findStringLength( inputString );
		
		Utility.positionCheck(length, firstIndex);
		
		Utility.positionCheck(length, lastIndex);
		
		Utility.checkTwoPositions( firstIndex , lastIndex );
		
		return inputString.substring(firstIndex,lastIndex);
		
	}
	
	public boolean startingCheck( String oneString,String anotherString ) throws CustomException
	{
		
		Utility.stringCheck(oneString);
		
		Utility.stringCheck(anotherString);
		
		return oneString.startsWith(anotherString);
		
	}
	
	public boolean endingCheck( String oneString,String anotherString ) throws CustomException
	{
		
		
		Utility.stringCheck(oneString);
		
		Utility.stringCheck(anotherString);
		
		return oneString.endsWith(anotherString);
		
	}


	public String toConvertUpper(String lowerCaseString) throws CustomException
	{
		
		Utility.stringCheck(lowerCaseString);
		
		return lowerCaseString.toUpperCase();
		
	}
	
	public String toConvertLower(String upperCaseString) throws CustomException
	{
		
		Utility.stringCheck(upperCaseString);
		
		return upperCaseString.toLowerCase();
		
	}


	public String concatStrings( String[] inputStrings, int count ) throws CustomException
	{
		
		 Utility.arrayCheck( inputStrings );
		
		 String output=inputStrings[0];
		 
		 for( int i=1;i<count;i++  )
		 {
			 
			 output+=inputStrings[i];
		 }
		
		 return output;
		
	}


	public String replaceString( String inputString, String removeLetters, String newLetters ) throws CustomException
	{
		
		Utility.stringCheck(inputString);
		
		Utility.stringCheck(removeLetters);
		
		Utility.stringCheck(newLetters);
		
		return inputString.replaceAll(removeLetters, newLetters);
	}


	public String[] splitString( String inputString, String letter ) throws CustomException
	{
		
		Utility.stringCheck(inputString);
		
		Utility.stringCheck(letter);
		
		return inputString.split(letter);
		
	}


	public String mergeStrings( String[] inputStrings, int count, String sympol ) throws CustomException
	{
		Utility.arrayCheck( inputStrings );
		
		Utility.stringCheck(sympol);
		
		return String.join(sympol,inputStrings);
	
	}


	public String toReverseAString( String inputString ) throws CustomException
	{
        
		int length=findStringLength( inputString  );
		
		String output="";
		
		for( int i=length-1;i>=0;i-- )
		{
			output+=findTheLetter(  inputString , i );
		}
		
		return output;
		
	}
	    
	public boolean isTwoStringsAreEqual( String oneString,String anotherString ) throws CustomException
	{
		
        Utility.stringCheck(oneString);
		
		Utility.stringCheck(anotherString);
		
		return oneString.equals(anotherString);
		
	}
	
	public boolean isTwoStringsAreEqualsIgnoreCase( String oneString,String anotherString ) throws CustomException
	{
		
        Utility.stringCheck(oneString);
		
		Utility.stringCheck(anotherString);
		
		return oneString.equalsIgnoreCase(anotherString);
		
	}
	
	public String toTrimAString( String inputString ) throws CustomException
	{
		
		Utility.stringCheck(inputString);
		
		return inputString.trim();
		
	}
	
	
}
