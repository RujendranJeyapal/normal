//$Id$
package queue;

import java.util.PriorityQueue;
import java.util.Queue;

import utility.CustomException;
import utility.Utility;

public class QueueLogic 
{

	      private Queue<Object> actualQueue=new PriorityQueue<>();
	
	   
	      
	      
	      public int sizeOfQueue()
	      {
	    	  
	    	   return actualQueue.size();
	    	  
	      }
	      
	      
	      public boolean add( Object object )
	      {
	    	  
	    	 
	    	  
	    	  return actualQueue.add( object );
	    	  
	      }
	      
	   
	      
	      public boolean offer( Object object )
	      {
	    	  
	    	  return actualQueue.offer( object );
	    	  
	      }
	      
	      public Object remove(  ) throws CustomException
	      {
	    	  
	    	  Utility.emptyCheckForCollection( actualQueue , "Queue" );
	    	  
	    	  return actualQueue.remove();
	    	  
	      }
	      
	      public Object poll()
	      {
	    	  
	    	  return actualQueue.poll();
	    	  
	      }
	      
	      public Object element() throws CustomException
	      {
	    	  Utility.emptyCheckForCollection( actualQueue , "Queue" );
	    	  
	    	  return actualQueue.element();
	    	  
	      }
	      
	      public Object peek()
	      {
	    	  
	    	  return actualQueue.peek();
	    			
	      }
	      
	      public Queue<Object> getActualQueue()
	      {
	    	  
	    	  return actualQueue;
	    	  
	      }
	
	
}
