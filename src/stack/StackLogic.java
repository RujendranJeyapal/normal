//$Id$
package stack;

import java.util.Stack;

import utility.CustomException;

public class StackLogic 
{

	
	     Stack<Object> actualStack=new Stack<>();
	
	     
	     private void emptyCheck() throws CustomException
	     {
	    	 
	    	 if( isStackEmpty() )
	    	 {
	    		 throw new CustomException( "Stack is Empty" );
	    	 }
	    	 
	     }
	     
	     
	     public Object push( Object object )  
	     { 
	    	 return actualStack.push( object );
	     }
	     
	     
	     public Object peek() throws CustomException
	     {
	    	 emptyCheck();
	    	 return actualStack.peek();
	     }
	     
	     public Object pop() throws CustomException
	     {
	    	 emptyCheck();
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
