//$Id$
package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import utility.CustomException;
import utility.Utility;

public class ArrayListLogic 
{
          
	     ArrayList<Object> actualList=new ArrayList<>();
	     
	     
	     public void addToArrayList( Object object[] )
	     {
	    	
	    	actualList.addAll( Arrays.asList( object ) ) ;
	    	 
	     }
	     
	     public void addToArrayListGivenPosition( int index , Object object ) 
	     {
	    	 
	    	
	    	 actualList.add( index , object );
	    	 
	     }
	     
	     public void addTwoLists( ArrayList<Object> anotherList )
	     {
	    	 
	    	 actualList.addAll( anotherList );
	    	 
	     }
	     
	     public void addListToIndexOfAnotherList( int index , ArrayList<Object> anotherList )  
	     {
	    	
	    	 
	    	 actualList.addAll( index , anotherList );
	    	 
	     }
	     
	     public int sizeOfArrayList()
	     {
	    	 
	    	  
	    	 
	    	 return actualList.size();
	    	 
	     }
	     
	     public int getIndexOfObject( Object object )
	     {
	    	 
	    	 return actualList.indexOf( object );
	    	 
	     }
	     
	     public int getLastIndexOfObject( Object object )
	     {
	    	 
	    	 return actualList.lastIndexOf( object );
	    	 
	     }
	     
	     public Object getObject( int index ) throws CustomException 
	     {
	    	 Utility.indexCheckForArrayList( sizeOfArrayList() , index );
	    	 return actualList.get( index );
	    	 
	     }
	     
	     public List<Object> getSubList( int startingPosition , int endingPosition ) throws CustomException
	     {
	    	 

	    	 Utility.checkTwoPositions( startingPosition , endingPosition );

	    	 return   actualList.subList( startingPosition , endingPosition );
	    	 
	    	 
	     }
	     
	     public boolean isExist( Object object )
	     {
	    	
	    	 return actualList.contains( object );
	    	 
	     }
	     
	     public void removePosition( int index ) throws CustomException
	     {
	    	 
	    	 Utility.indexCheckForArrayList( sizeOfArrayList() , index );
	    	 
	    	 actualList.remove( index );
	    	 
	    	 
	     }
	     
	     
	     public void removeObject( Object object )
	     {
	    	 
	    	actualList.remove( object );
	    	
	     }
	     
	     public void removeAllObjects(  ArrayList< Object > anotherList )  
	     {
	    	 
	    	 actualList.removeAll( anotherList );
	    	 
	     }
	     
	     public void retainAllObjects(  ArrayList< Object > anotherList )  
	     {
	    	 
	    	 actualList.retainAll( anotherList );
	    	 
	     }
	     
	     
	     public void clearArrayList()
	     {
	    	 actualList.clear();
	     }
	     
	     public ArrayList<Object> getActualList()
	     {
	    	 return actualList;
	     }
	     
	     public ArrayList<Object> getArrayListWithObjects( )
	     {
	    	 
	    	 ArrayList<Object> oneList=new ArrayList<>();
	    	 
	    	 oneList.add( 1 );
	    	 
	    	 oneList.add( "Ram" );
	    	 
	    	 oneList.add( "Lakshmanan" );
	    	 
	    	 oneList.add( "Barathan" );
	    	 
	    	 return oneList;
	    	 
	     }
	     
	  
	
	
}
