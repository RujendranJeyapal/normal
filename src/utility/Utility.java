//$Id$
package utility;

import java.util.HashMap;

public class Utility 
{

	public static void stringCheck( String inputString ) throws CustomException
	{
		
		if( inputString==null || inputString.isEmpty()  )
		{
		        throw new CustomException( "Don't enter null or Empty String " );	
		}
		
	}
	
	public static void arrayCheck( String inputStrings[] ) throws CustomException
	{
		
		for( int i=0;i<inputStrings.length;i++ )
		{
			stringCheck( inputStrings[i] );
		}
		
	}
	
	public static void hashMapCheck( HashMap<Object,Object> actualMap ) throws CustomException
	{
		
		if( actualMap==null )
		{
		        throw new CustomException( "HashMap is null" );	
		}
		
	}
	
	public static void numberCheck( int number ) throws CustomException
	{
		
		if( number<=0  )
		{
			throw new CustomException( " Don't enter a negative or zero " );
		}
		
	}
	
	
	public static void positionCheck( int stringLength ,int position ) throws CustomException
	{
		if( position<0 || position>=stringLength )
		{
			throw new CustomException( " Enter Correct position " );
		}
	}
	
	
	public static void checkTwoPositions( int position1 ,int position2 ) throws CustomException
	{
		if( position1>position2 )
		{
			throw new CustomException( " Enter Correct position " );
		}
	}
	
	
}
