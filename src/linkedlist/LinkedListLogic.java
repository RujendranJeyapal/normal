//$Id$
package linkedlist;


import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import utility.CustomException;
import utility.Utility;

public class LinkedListLogic 
{
             
	         private LinkedList<Object> actualList=new LinkedList<>();
	         
	         
	      
	
	         public void addToLinkedList( Object object[] )
	 	     {
	 	    	
	 	    	actualList.addAll( Arrays.asList( object ) ) ;
	 	    	 
	 	     }
	 	     
	         public void addFirstIndex( Object objct )
	         {
	        	 actualList.addFirst( objct );
	         }
	         
	         public void addLastIndex( Object objct )
	         {
	        	 actualList.addLast( objct );
	         }
	         
	         
	         public Object element(  ) throws CustomException
	         {
	        	 Utility.emptyCheckForList( actualList );
	        	 return actualList.element();
	         }
	         
	         public Object peek()
	         {
	        	 return actualList.peek();
	         }
	         
	         public Object peekFirst()
	         {
	        	 return actualList.peekFirst();
	         }
	         
	         public Object peekLast()
	         {
	        	 return actualList.peekLast();
	         }
	         
	         public Object poll()
	         {
	        	 return actualList.poll();
	         }
	         
	         
	         public Object pollFirst()
	         {
	        	 return actualList.pollFirst();
	         }
	         
	         public Object pollLast()
	         {
	        	 return actualList.pollLast();
	         }
	         
	         
	         public Object getFirst() throws CustomException
	         {
	        	 Utility.emptyCheckForList( actualList );
	        	 return actualList.getFirst();
	         }
	         
	         public Object getLast() throws CustomException
	         {
	        	 Utility.emptyCheckForList( actualList );
	        	 return actualList.getLast();
	         }
	         
	         public boolean offer( Object object )
	         {
	        	 return actualList.offer( object );
	         }
	         
	         public boolean offerFirst( Object object )
	         {
	        	 return actualList.offerFirst( object );
	         }
	         
	         
	         public boolean offerLast( Object object )
	         {
	        	 return actualList.offerLast( object );
	         }
	         
	         
	 	     public void addToLinkedListGivenPosition( int index , Object object ) 
	 	     {	 
	 	    	
	 	    	 actualList.add( index , object );
	 	    	 
	 	     }
	 	     
	 	     public Object set( int index , Object object )
	 	     {
	 	    	 return actualList.set( index , object );
	 	     }
	 	     
	 	     public void addTwoLists( LinkedList<Object> anotherList )
	 	     {
	 	    	 
	 	    	 actualList.addAll( anotherList );
	 	    	 
	 	     }
	 	     
	 	     public void addListToIndexOfAnotherList( int index , LinkedList<Object> anotherList )  
	 	     {
	 	    	
	 	    	 
	 	    	 actualList.addAll( index , anotherList );
	 	    	 
	 	     }
	 	     
	 	     public int sizeOfLinkedList()
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
	 	    	 Utility.indexCheckForList( sizeOfLinkedList() , index );
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
	 	    	 
	 	    	 Utility.indexCheckForList( sizeOfLinkedList() , index );
	 	    	 
	 	    	 actualList.remove( index );
	 	    	 
	 	    	 
	 	     }
	 	     
	 	     
	 	     public void removeObject( Object object )
	 	     {
	 	    	 
	 	    	actualList.remove( object );
	 	    	
	 	     }
	 	     
	 	     public void removeAllObjects(  LinkedList< Object > anotherList )  
	 	     {
	 	    	 
	 	    	 actualList.removeAll( anotherList );
	 	    	 
	 	     }
	 	     
	 	     public void retainAllObjects(  LinkedList< Object > anotherList )  
	 	     {
	 	    	 
	 	    	 actualList.retainAll( anotherList );
	 	    	 
	 	     }
	 	     
	 	     public Object removeFirst() throws CustomException
	 	     {
	 	    	 Utility.emptyCheckForList( actualList );
	 	    	 
	 	    	 return actualList.removeFirst();
	 	     }
	 	     
	 	     
	 	     public Object removeLast() throws CustomException
	 	     {
	 	    	 Utility.emptyCheckForList( actualList );
	 	    	 
	 	    	 return actualList.removeLast();
	 	     }
	 	     
	 	     
	 	     public boolean removeFirstOccurence( Object object )
	 	     {
	 	    	 return actualList.removeFirstOccurrence( object );
	 	     }
	 	     
	 	     public boolean removeLastOccurence( Object object )
	 	     {
	 	    	 return actualList.removeLastOccurrence( object );
	 	     }
	 	     
	 	     
	 	     
	 	     public void clearLinkedList()
	 	     {
	 	    	 actualList.clear();
	 	     }
	 	     
	 	     public LinkedList<Object> getActualList()
	 	     {
	 	    	 return actualList;
	 	     }
	 	     
	 	     public LinkedList<Object> getLinkedListWithObjects( )
	 	     {
	 	    	 
	 	    	 LinkedList<Object> oneList=new LinkedList<>();
	 	    	 
	 	    	 oneList.add( 1 );
	 	    	 
	 	    	 oneList.add( "Ram" );
	 	    	 
	 	    	 oneList.add( "Lakshmanan" );
	 	    	 
	 	    	 oneList.add( "Barathan" );
	 	    	 
	 	    	 return oneList;
	 	    	 
	 	     }
	
	
	
	
}
