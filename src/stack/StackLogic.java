//$Id$
package stack;

import java.util.Stack;

import utility.CustomException;
import utility.Utility;

public class StackLogic 
{

	
	     Stack<Object> actualStack=new Stack<>();
	
	     
	     
	     
	     
	     public Object push( Object object )  
	     { 
	    	 return actualStack.push( object );
	     }
	     
	     
	     public Object peek() throws CustomException
	     {
	    	 Utility.emptyCheckForCollection( actualStack , "Stack" );
	    	 return actualStack.peek();
	     }
	     
	     public Object pop() throws CustomException
	     {
	    	 Utility.emptyCheckForCollection( actualStack , "Stack" );
	    	 return actualStack.pop();
	     }
	
	     public boolean isStackEmpty()
	     {
	    	 return actualStack.empty();
	     }
	
	     
	     public int searchObject( Object object )
	     {
	    	 return actualStack.search( object );
	     }
	
	     
	     public Stack<Object> getActualStack()
	     {
	    	 return actualStack;
	     }
	     
	     
	     public int sizeOfStack()
	     {
	    	   return actualStack.size();
	     }
}
