//$Id$
package utility;

import java.util.List;

import java.util.Collection;

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
	
	public static void indexCheckForList( int size , int index ) throws CustomException
	{
		
		
		if( index<0 ||  index>=size )
		{
		        throw new CustomException( "Enter the correct Index" );	
		}
		
		
		
	}
	
	
	public static void emptyCheckForCollection( Collection<Object> collection , String collectionName ) throws CustomException
    {
   	 
   	 if( collection.isEmpty() )
   	 {
   		 throw new CustomException( collectionName+" is Empty" );
   	 }
   	 
    }
	
	
	
	public static void emptyCheckForList( List<Object>  oneList) throws CustomException
	{
		if( oneList.isEmpty() )
		{
			throw new CustomException( "List has no element" );
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
